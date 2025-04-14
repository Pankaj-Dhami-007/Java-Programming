class RunnableExample implements Runnable{

    
    @Override
    public void run() {
        for(int i =1; i<= 5; i++){
            System.out.println("Thread is Running "+i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }

    public static void main(String[] args) {
        RunnableExample myRunnable = new RunnableExample();
        Thread t1 = new Thread(myRunnable);
        t1.start();
    }
}