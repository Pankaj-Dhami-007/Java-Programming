//This class represents the actual task you want to perform. Notice it doesn’t care about threads

class MyTask {
    
    private int limit;

    public MyTask(int limit) {
        this.limit = limit;
    }

    public void performTask() {
        int sum = 0;
        for (int i = 1; i <= limit; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}
// This class implements Runnable and wraps the task inside it, allowing the task to be executed in a separate thread.
class TaskRunnable implements Runnable {
    private MyTask task;

    public TaskRunnable(MyTask task) {
        this.task = task;
    }

    @Override
    public void run() {
        task.performTask();  // Running the task in a separate thread
    }
}

public class RunnebleClass {
    public static void main(String[] args) {
        MyTask task = new MyTask(100);           // Create the task
        TaskRunnable runnable = new TaskRunnable(task);  // Wrap it in a Runnable

        Thread thread = new Thread(runnable);    // Create a Thread to run the task
        thread.start();                          // Start the threa
    }
}

/*
 Explanation:
MyTask: Focuses only on what needs to be done (calculating a sum).
TaskRunnable: Wraps the task into a Runnable so it can be run by a thread.
Thread: Handles the running of the task in a separate thread.


Here, we separate the task (what is being done) from the thread (which handles the execution), providing better design flexibility. You can now reuse the MyTask class in different places or run it in different threads without changing the task itself.

Purpose of TaskRunnable: The TaskRunnable class serves as a wrapper for the MyTask object, allowing the task to be executed in a separate thread. By implementing Runnable
 */
