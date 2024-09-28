public class ReverseString {
    static String reverse(String str){
         String s = "";
         for(int i = str.length()-1; i>=0; i--){
            s += str.charAt(i);
         }
         return s;
    }
    public static void main(String[] args) {
        String str = "abcde";
         System.out.println(reverse(str));
    }
}
