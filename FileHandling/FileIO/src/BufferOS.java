
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BufferOS {
    public void writeData(){
        String content = " hello, BufferedOutputStream";
        try(OutputStream os= new FileOutputStream("bufferFile.txt");
        BufferedOutputStream bos = new BufferedOutputStream(os)) {
            byte[] byteData = content.getBytes();
            bos.write(byteData);
            System.out.println("successful!..");
        } catch (IOException e) {
            
        }
    }
}
