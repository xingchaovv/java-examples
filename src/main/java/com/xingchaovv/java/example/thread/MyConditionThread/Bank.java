package com.xingchaovv.java.example.thread.MyConditionThread;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 银行类
 */
public class Bank
{
   private Lock bankLock = new ReentrantLock();
   private Condition remainTrigger;
   // 多个账户
   private final int[] accounts;

   /**
    * 构造
    * @param n 账户数量
    * @param initialBalance 每个账户初始金额
    */
   public Bank(int n, int initialBalance)
   {
      accounts = new int[n];
      Arrays.fill(accounts, initialBalance); // 填充
      remainTrigger = bankLock.newCondition();
   }

   /**
    * 从一个账户转移一一部分钱到另外一个账户
    * @param from 来源账户
    * @param to 目标账户
    * @param amount 金额
    */
   public void transfer(int from, int to, int amount) throws InterruptedException
   {
      bankLock.lock();
      System.out.printf("%30s：获取锁\n", Thread.currentThread());
      try {
         while (accounts[from] < amount) {
            System.out.printf("%30s：余额不足，线程阻塞\n", Thread.currentThread());
            remainTrigger.await();
         }
         accounts[from] -= amount;
         accounts[to] += amount;
         System.out.printf("%30s：从 %4d 转移 %10d 到 %4d，总余额：%s\n", Thread.currentThread(), from, amount, to, getTotalBalance());
         System.out.printf("%30s：解除所有余额不足的线程阻塞\n", Thread.currentThread());
         remainTrigger.signalAll();
      } finally {
         System.out.printf("%30s：释放锁\n", Thread.currentThread());
         bankLock.unlock();
      }
   }

   /**
    * 求和
    * @return 总余额
    */
   public int getTotalBalance()
   {
      int sum = 0;

      for (int a : accounts)
         sum += a;

      return sum;
   }

   /**
    * 求账户数量
    * @return 账户数量
    */
   public int size()
   {
      return accounts.length;
   }
}
