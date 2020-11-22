package example.thread.MyUnsyncThread;

import java.util.*;

/**
 * 银行类
 */
public class Bank
{
   // 多个账户
   private final double[] accounts;

   /**
    * 构造
    * @param n 账户数量
    * @param initialBalance 每个账户初始金额
    */
   public Bank(int n, double initialBalance)
   {
      accounts = new double[n];
      Arrays.fill(accounts, initialBalance); // 填充
   }

   /**
    * 从一个账户转移一一部分钱到另外一个账户
    * @param from 来源账户
    * @param to 目标账户
    * @param amount 金额
    */
   public void transfer(int from, int to, double amount)
   {
      if (accounts[from] < amount) return;
      accounts[from] -= amount;
      accounts[to] += amount;
      System.out.printf("%30s：从 %4d 转移 %10.2f 到 %4d，总余额：%s\n", Thread.currentThread(), from, amount, to, getTotalBalance());
   }

   /**
    * 求和
    * @return 总余额
    */
   public double getTotalBalance()
   {
      double sum = 0;

      for (double a : accounts)
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
