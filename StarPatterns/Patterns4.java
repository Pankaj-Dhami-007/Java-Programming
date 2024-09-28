public class Patterns4 {
    static void printP(int n){
        int m = 7;
        for(int i =n; i >=1; i--){
            for(int j=1; j<= n-i; j++){
                System.out.print(" ");
            }
            for(int j =1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();  
        }
    }
    static void printPyramid(int n){
        for(int i =1; i<=n; i++){
            for(int j = 1; j<= n-i; j++){
                System.out.print(" "); 
            }
            for(int j =1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();  
        }
    }
    static void print(int n){
        for(int i =1; i<=n; i++){
            for(int j = 1; j<= n-i; j++){
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
        System.out.println();
        printPyramid(n);
        System.out.println();
        printP(n); 
    }
}
