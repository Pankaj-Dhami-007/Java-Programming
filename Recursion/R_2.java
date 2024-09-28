import java.util.*;
public class R_2 {
    static int factorial(int n){
        int fact =1;
        for(int i = n; i>=1; i--){
            fact = fact*i;
        }
        return fact;
    }
    static int fact(int n){
        if(n == 0) return 1;
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter any no .");
        int n = sc.nextInt();
           int r = fact(n);
           System.out.printf("The factorial of %d is %d",n, r);
           System.out.println();
          System.out.println(factorial(n));
    }
}
