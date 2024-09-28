import java.util.*;
class StringQ1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        for(int i =0; i<n; i++){
            for(int j = i+1; j<n+1; j++){
                System.out.print(str.substring(i, j)+ " ");
            }
              System.out.println();
        }
        
    }
}