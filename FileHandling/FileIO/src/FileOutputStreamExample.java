import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamExample {
    public void writeFile(){
        try(OutputStream os = new FileOutputStream("file.txt")) {
            String content = "It is complicated";
            // os.write(content.getBytes());

            byte[] byteData = content.getBytes();
            os.write(byteData);
            System.out.println("Data Written successfully!");
        } catch (IOException e) {
            
        }
    }
}
