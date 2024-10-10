class Test{
    public long factorial(int n){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        long fact =1;
        for(int i =1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }
}

public class Main {
    static long factorial(int n){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        long fact =1;
        for(int i =1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        // long startTime = System.currentTimeMillis();// 1 jan 1970
        // Test t = new Test();
        // for(int i = 1; i<10; i++){
        // System.out.println(t.factorial(i)); 
        // }
        // System.out.println("Total time : "+(System.currentTimeMillis()- startTime));


        long startTime = System.currentTimeMillis();
        Thread[] threads = new Thread[9];
        for(int i = 1; i<10; i++){
            int finalI = i;
            threads [i -1 ] = new Thread(
                () ->{
                    System.out.println(factorial(finalI)); 
                }
            );
            threads[i-1].start();
        }
        for(Thread thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                
            }
        }
        System.out.println("Total time : "+(System.currentTimeMillis()- startTime));
    }
}
