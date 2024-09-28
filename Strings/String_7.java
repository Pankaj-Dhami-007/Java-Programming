public class String_7 {
    public static void main(String[] args) {
        String str = "abcd";
        int n = str.length();
        for(int i = 0; i< n; i++){
            for(int j =i+1; j<n+1; j++){
                System.out.print(str.substring(i, j)+" ");
            }
        }
    }
}
