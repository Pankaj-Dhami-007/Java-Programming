import java.util.*;

public class RecursionQ3 {
    static int fibb(int n){
           if(n == 0 || n== 1){
            return n;
           }

          int prev = fibb(n-1);
          int prePrev = fibb(n-2);
          
          int ans = prev + prePrev;
          return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =0; i< n; i++){
            System.out.print(fibb(i)+ " ");
        }
        System.out.println();
        
     
    }
}
