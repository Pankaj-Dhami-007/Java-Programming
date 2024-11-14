@FunctionalInterface
interface Bird {

    void canFly();
}

@FunctionalInterface
interface MathOperation {
   
        int operate(int a, int b);
}
public class Main {
    public static void main(String[] args){
        //Bird eagleObj = () ->System.out.println("Implemented by anonymous inner class");
        //eagleObj.canFly();


        // MathOperation operation = new MathOperation() {
        //    @Override
        //     public int operate(int a, int b) {
        //         return a+b;
        //     }           
        // };
        // System.out.println(operation.operate(44, 44));
         

        MathOperation Addition = (a, b) -> a+b;
        System.out.println(Addition.operate(44, 44));


        // Bird eagleObj = new Bird(){

        //     @Override
        //     public void canFly() {
        //         System.out.println("Implemented by anonymous inner class");
                
        //     }
            
        // };
 
        //eagleObj.canFly();

        // Bird eagle = new Eagle();
        // eagle.canFly();
    }
}
