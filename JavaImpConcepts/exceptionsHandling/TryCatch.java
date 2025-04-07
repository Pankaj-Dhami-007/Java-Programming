class Student{
      private Long id;
      public void setId(Long id){
        this.id = id;
      }
      public Long getId(){
        return id;
      }
}

class TryCatch{

    static int devide(int a, int b){
        try {
            Student student = null;
            student.setId(101L);
            System.out.println(student.getId());
            return a/b;
        } 
        //wrong order
        // catch (Exception e) {
        //     System.out.println(e);
        //     return -1;
        // }
        // catch(NullPointerException e){
        //     System.out.println("Null pointer exception");
        //     return -1;
        // }

        // catch(ArithmeticException e){
        //     System.out.println("Arithmetic exception");
        //     return -1;
        // }

        
            catch(NullPointerException e){
                System.out.println("Null pointer exception");
                return -1;
            }
    
            catch(ArithmeticException e){
                System.out.println("Arithmetic exception");
                return -1;
            }
            catch (Exception e) {
                System.out.println(e);
                return -1;
            }

            // wrong 
            // catch(NullPointerException  | RuntimeException e){
            //     System.out.println("Null pointer exception");
            //     return -1;
            // }
        
    }
     public static void main(String[] args) {
    devide(1, 0);
}
}
