class MyTask{
    private int limit;
    public MyTask(int limit){
        this.limit = limit;
    }

    public void findSum(){
        int sum =0;
        for(int i =1; i<=limit; i++){
            sum += i;
        }
        System.out.println("Sum is: "+sum);
    }
}

class MyRunnable implements Runnable{

    private final MyTask task;

    public MyRunnable(MyTask task){
        this.task = task;
    }
    @Override
    public void run() {
        
        task.findSum();
    }
    
}

public class RunnableEx_3{
      public static void main (String[] args){

        MyTask myTask = new MyTask(100);
        MyRunnable runnable = new MyRunnable(myTask);
        Thread t1 = new Thread(runnable);
        t1.start();
      }
}