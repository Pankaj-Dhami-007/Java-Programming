class Walk extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName());
        }

    }
    
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Guys!..");
        }
        
    }
    
}

class MyName implements Runnable{

    @Override
    public void run() {
        System.out.println("Dhami");
        
    }
    
}
public class ThreadsDemo {
    public static void main(String[] args) throws InterruptedException{
        Walk w = new Walk();
        w.start();
        w.join();

        // MyRunnable m = new MyRunnable();
        // Thread t = new Thread(m);
        // t.start();
        // for (int i = 0; i < 100; i++) {
        //     System.out.println("Hello");
        // }

        // MyName name = new MyName();
        // Thread t = new Thread(name);
        // t.start();
        
        //System.out.println(Thread.currentThread().getName());
    }
}
