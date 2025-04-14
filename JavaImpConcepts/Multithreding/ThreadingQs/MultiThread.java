
class BankAccount {

    private double balance = 0;


    // public void deposit() {
    //     balance += 1;
    // }

    public synchronized void deposit() {
        balance += 1;
    }

    public double getBalance() {
        return balance;
    }
}

class MyTask implements Runnable {

    private BankAccount bankAccount;

    public MyTask(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100000; i++) {
            bankAccount.deposit();
        }
    }

}

public class MultiThread {

    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();
        MyTask task = new MyTask(account);
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Balance: "+account.getBalance());


        //without join -Problem: Main thread doesn't wait
        //t1.start();
        //t2.start();
        //System.out.println("Balance: " + account.getBalance());  // 🛑 Might print too early!
        //The System.out.println(...) could run before t1 and t2 have finished updating the balance.

        //with join()
        //sout Runs after both threads are done
        //"Hey main thread! Wait until t1 and t2 are completely done before printing the final balance."


        /*
💡 Real-life Example:
Imagine two workers (threads) are depositing money into a bank account, and the manager (main thread) wants to print the total balance only after both workers finish.

Without join(): The manager might check the balance too early.

With join(): The manager waits for both to finish, then checks the balance.
         */

        // t1.start(); 
        // t1.join();//wait for t1 to finish
        // System.out.println("Balance: "+account.getBalance());        
        // t2.start();
        // t2.join();//wait for t2 to finish
        // System.out.println("Balance: "+account.getBalance());
//         t1.start();         
//         t2.start();
//        System.out.println("Balance: "+bankAccount.getBalance());
//         ❗ Problem: Race Condition
// Both threads are trying to update balance at the same time without synchronization. This can lead to inconsistent or unexpected balance values because thread operations (like reading and writing balance) are not atomic.
// Even though logically, each thread should deposit 500 x 10 = 5000, and two threads should result in 10000, in reality, you might see less than 10000 due to thread interference.
// Without synchronization, multiple threads can cause race conditions.
// Use synchronized to make critical sections thread-safe.
// This is a common interview topic when discussing concurrency in Java.
    }
}
