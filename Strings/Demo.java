// import java.lang.*;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        
        // char 1 letter only
        // char ch='@';

        //String : collection of characters are called string

        String s="Aman"; // String constant pool 
        // System.out.println(s);
        // System.out.println(s instanceof String);
        // System.out.println(s.getClass().getName());
        // System.out.println("tyhvj".getClass().getName());

        // String str=new String("Aman"); // Heap Memory 
        // String str2=new String("Aman"); // Heap Memory 
        // System.out.println(str);
        // String s2="Aman";

        // System.out.println("Aman"=="Aman");
        // System.out.println(s==s2);
        // System.out.println(s=="Aman");
        // System.out.println(str==str2);
        // System.out.println(str==s);
        // System.out.println("------------------------------------------");

        // System.out.println("Aman".equals("Aman"));
        // System.out.println(s.equals(s2));
        // System.out.println(s.equals("Aman"));
        // System.out.println(str.equals(str2));
        // System.out.println(str.equals(s));


        // System.out.println("Aman".hashCode());
        // System.out.println("Aman".hashCode());
        // System.out.println(s.hashCode());
        // System.out.println(s2.hashCode());

        Scanner sc=new Scanner(System.in);
        // String s3=sc.next();
        // System.out.println(sc.next().hashCode());
        // System.out.println(s3.hashCode());
        // System.out.println(s==s3);

        // s.concat("Tiwari");// Strings are immutable in java
        // s=s.concat("Tiwari");// re-initialization
        // System.out.println(s);

        // System.out.println(s.length());
        // System.out.println(s.charAt(2));
        // System.out.println(s.substring(2));
        // System.out.println(s.substring(2,s.length()));
        // System.out.println(s.substring(2,s.length()).charAt(2));

        // s.toCharArray();
        // byte arr[]=s.getBytes();
        // for(byte b:arr)
        // {
        //     System.out.println(b);
        // }
        // System.out.println(new String(arr));
        System.out.println("Aman".compareTo("aman"));
        System.out.println("aman".compareTo("Aman"));
        System.out.println("Aman".compareTo("Aman"));
        System.out.println("Azan".compareTo("Aman"));
        
        sc.close();
    }
}