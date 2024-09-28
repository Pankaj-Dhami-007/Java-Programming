import java.util.*;

public class R_4 {
    static int sumR(int n){
        if(n==1) return 1;
        return n+sumR(n-1);
    }
    static int sumNum(int n){
        int sum = 0;
        for(int i =1; i<=n; i++){
             sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
         System.out.println(sumNum(n));
         System.out.println();
         System.out.println(sumR(n));
    }
}
