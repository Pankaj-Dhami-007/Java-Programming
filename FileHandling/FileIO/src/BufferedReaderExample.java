import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public void readFile(){
               try (BufferedReader br = new BufferedReader(new FileReader("src\\impNote.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
               } catch (IOException e) {
                // TODO: handle exception
                e.printStackTrace();
               }
            }
}
