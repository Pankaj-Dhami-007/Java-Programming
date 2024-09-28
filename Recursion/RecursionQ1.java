import java.util.*;

public class RecursionQ1 {
    static void printDec(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDec(n-1);
    }
    static void printInc(int n){ //1,2...n-1,n
        if(n == 1){
            System.out.println(1);
            return;
        }
        printInc(n-1); // 1,2,3....n-1
        System.out.println(n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printInc(n);
        printDec(n);
    }
}
