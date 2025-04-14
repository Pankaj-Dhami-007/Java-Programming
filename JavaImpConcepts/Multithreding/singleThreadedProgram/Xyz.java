public class Xyz {
    public static void main(String[] args) {
        int a = 9;
        int b =3;

        try {
            int c = a/b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        System.out.println(" hellooooooo....");
    }
}
