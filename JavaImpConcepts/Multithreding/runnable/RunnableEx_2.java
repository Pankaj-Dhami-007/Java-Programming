class MyTask implements Runnable{

    @Override
    public void run() {
        System.out.println("Task executed by "+Thread.currentThread().getName());
        
    }
    
}

public class RunnableEx_2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyTask());
        t1.start();
    }
}
