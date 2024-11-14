@FunctionalInterface
interface MathOprations {

    int operate(int a, int b);
}
public class LamdaExpression {

    public static void main(String[] args) throws InterruptedException{
        // Thread t1 = new Thread(new Task());
        // t1.start();
        // t1.join();

        // Runnable runnable = new Runnable() {

        //     @Override
        //     public void run() {
        //         System.out.println("Anonymous inner class");
        //     }       
        // };
        // Thread t1 = new Thread(runnable);
        // t1.start();

        //Lamda expression
        // Runnable r = () -> System.out.println("Lamda Expression");
        // Thread t1 = new Thread(r);
        // t1.start();

        Thread myThread = new Thread(()->System.out.println("Another way"));
        myThread.start();


        MathOprations addOpration = (a, b)-> a+b;
        addOpration.operate(11, 11);
        MathOprations subtractOperation = (a, b)-> a-b;
        subtractOperation.operate(200, 100);
        
    }
}
class Task implements Runnable{
    @Override
    public void run() {
        System.out.println("hello");
        
    }
    
}
