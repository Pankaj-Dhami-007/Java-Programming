
// concatination of 2 or more Strings
// 2 methods---- 1--> + operator.  2--> inbuilt function as concat() 

public class String_1 {
    public static void main(String[] args) {
        String a = "pankaj";
        String b = "Singh";
        String c = "Dhami";
        String d = a+" hey";
        String e = a+10+20;
        String f = a+(10+20);
        System.out.println(a+b);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println();

        String g = a.concat(b);
        String h = a.concat(b)+"c";
        System.out.println(g);
        System.out.println(h);
        
    }
}
