/**
 * Synchronization
 */
class BankAccount{
    private double balance =0;
    public void deposit(){
       balance += 100;
    }
    public double getBalance(){
        return balance;
    }
}

class MyThread extends Thread{
    private BankAccount bankAccount;
    public MyThread(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }
    @Override
    public void run() {
        for(int i =0; i<1000; i++){
            bankAccount.deposit();
        }   
    }

    
}
public class Synchronization {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        MyThread t1 = new MyThread(b1);
        MyThread t2 = new MyThread(b1);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            
        }
        System.out.println(b1.getBalance());
    }
}