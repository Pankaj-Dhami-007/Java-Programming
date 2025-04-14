class ThreadExample extends Thread{
    
    @Override
    public void run() {
        for(int i= 1; i<=5; i++){
            System.out.println("Thread is running "+i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadExample t1 = new ThreadExample();
        t1.start();// start a thread

    }
}