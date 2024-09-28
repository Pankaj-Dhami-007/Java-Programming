/**
 * PalindromeString
 * ex-> madam
 */
public class PalindromeString {
    static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
       String str = "madam";
       if(isPalindrome(str)){
        System.out.println(str+" is a Palindrome");
       }
       else{
        System.out.println(str+" is not a Palindrome");
       }
    }
}