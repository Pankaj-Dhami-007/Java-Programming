public class Patterns7 {
    static void print(int n, int m){
        for(int i =1; i<=n; i++){
             for(int j =1; j<=m; j++){
                 if(i+j == 5 || j-i == 3 || i == 4){
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
        int n = 4;
        int m = 7;
        print(n, m);
}
}
