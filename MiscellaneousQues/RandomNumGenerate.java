import java.util.Random;

public class RandomNumGenerate {
    public static void main(String[] args) {
        // int i = (int)(Math.random()* 100);
        // System.out.println(i);

        Random random = new Random();
        System.out.println(random.nextInt(100));
    }
}
