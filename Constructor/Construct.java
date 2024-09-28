
class Demo{
    int data;
    Demo(int data){
        this.data = data;
        //System.out.println(this.data);
    }
}
class Construct{
    public static void main(String args[]){
      int data = 111;
      Demo d = new Demo(data);
      System.out.println(d.data);
    }
}