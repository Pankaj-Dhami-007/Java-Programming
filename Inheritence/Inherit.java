
/**
 * Inherit
 */
class Parent{
    String name = "Pankaj Singh Dhami";
    void print(){
        System.out.println(this.name);
    }
}
class child extends Parent{

}
public class Inherit {

    public static void main(String args[]){
        child c = new child();
        c.print();
    }
}