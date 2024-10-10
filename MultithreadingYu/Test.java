/**
 * Test
 */
class World extends Thread {

  @Override
  public void run() {
    for (int i = 0; i < 10000; i++) {
      System.out.println("World");
    }

  }

}

class Country implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 10000; i++) {
      System.out.println("India");
    }

  }

}

public class Test {

  public static void main(String[] args) {
    World w = new World();
    // w.start();
    Country c = new Country();
    Thread t = new Thread(c);
    t.start();

    for (int i = 0; i < 10000; i++) {
      System.out.println("Hello..");
    }
  }
}