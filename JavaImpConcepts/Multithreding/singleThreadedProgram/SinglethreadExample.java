
class SingleThreadedExample{
    static void doWork(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        System.out.println("Work done by "+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
         System.out.println("Task 1 is started");
         doWork();
         System.out.println("Task 2 started..");
         doWork();
         System.out.println("task 3 is started");
         doWork();
         System.out.println("All task has completed");
    }
}