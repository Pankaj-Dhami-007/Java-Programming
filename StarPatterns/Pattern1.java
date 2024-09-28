import java.util.*;

public class Pattern1{
    static void print(int n, int m){
        for(int i=1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         int rows = sc.nextInt();
         int colm = sc.nextInt();
         print(rows, colm);
    }
}