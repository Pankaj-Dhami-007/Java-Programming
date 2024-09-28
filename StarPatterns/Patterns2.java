public class Patterns2 {
    static void print(int n, int m){
          for(int i = 5; i>=1; i--){
            for(int j =1; j <=i; j++){
                System.out.print("*" +" ");
            }
            System.out.println();
          }
    }
    public static void main(String args[]){
        int n = 5;
        int m = 5;
        print(n, m);
    }
}
