import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStream;

public class BufferedInputStreamEx {
    public void readFile(){
        try(InputStream is = new FileInputStream("bufferFile.txt");
        BufferedInputStream bis = new BufferedInputStream(is)) {
            
        int content;
        while ((content = bis.read()) != -1) {
            System.out.print((char)content);
        } 
        System.out.println("  read successfully!....");
            
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
