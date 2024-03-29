package example1202.MyUnsyncThread;

/**
 * 竞争条件例子，银行账户账户转移
 */
public class Main
{
   public static final int NACCOUNTS = 100;
   public static final double INITIAL_BALANCE = 1000;
   public static final double MAX_AMOUNT = 1000;
   public static final int DELAY = 10;

   public static void main(String[] args)
   {
      Bank bank = new Bank(NACCOUNTS, INITIAL_BALANCE);
      // 循环构建线程
      for (int i = 0; i < NACCOUNTS; i++)
      {
         // 来源账户
         int fromAccount = i;
         // 匿名 Runnable 实例
         Runnable r = () -> {
            try
            {
               while (true)
               {
                  int toAccount = (int) (bank.size() * Math.random());
                  double amount = MAX_AMOUNT * Math.random();
                  bank.transfer(fromAccount, toAccount, amount);
                  Thread.sleep((int) (DELAY * Math.random()));
               }
            }
            catch (InterruptedException e)
            {
            }
         };
         Thread t = new Thread(r);
         t.start();
      }
   }
}
