import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public void readFile(){
        
        try(InputStream is = new FileInputStream("C:\\Users\\panka\\OneDrive\\Desktop\\JavaVScode\\FileHandling\\FileIO\\src\\file.txt")) {
            int content;
            while ((content = is.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println(e.getLocalizedMessage());
        }
    }
}
