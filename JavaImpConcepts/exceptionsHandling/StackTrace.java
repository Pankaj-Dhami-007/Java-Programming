public class StackTrace {
    public static void main(String[] args) {
        Level1();
    }
    public static void Level3(){
        int[] array = new int[5];
        array[5] = 10;

    }

    public static void Level2(){
        Level3();

    }

    public static void Level1(){
        Level2();

    }
}

// it print stack trace
