
// CharAt(int index)  and  setCharAt(int index, char c) functions
public class String_3 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("PankajDhamiABC");
        char c = s1.charAt(0);
        System.out.println(c);
        s1.setCharAt(11, 'a');
        System.out.println(s1);
    }
}
