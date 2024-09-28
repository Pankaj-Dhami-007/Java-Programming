public class Patterns5 {
    static void print(int n, int m){
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                if(j == 1|| j == m|| i ==1 || i == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n = 5;
int m = 7;
print(n, m);
    }
}
