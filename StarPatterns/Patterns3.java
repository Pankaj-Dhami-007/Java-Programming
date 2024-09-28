public class Patterns3 {
    static void print(int n){
        for(int i =5; i>=1; i--){
            for(int j = 1; j<= 5-i; j++){
                System.out.print(" ");

            }
            for(int j =1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n = 5;
        print(n);
    }
}
