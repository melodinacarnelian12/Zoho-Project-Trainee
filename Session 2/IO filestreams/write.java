import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class WriteFileExample {

    public static void main(String[] args) {
        writeFile();
    }

    // Write file using BufferedWriter
    public static void writeFile() {
        try (BufferedWriter bw = new BufferedWriter(//creating a new object as bw 
            new FileWriter("/Users/melo-pt6747/Desktop/Write.txt"))) {
            String s = "This program is used to write a file \n";
            bw.write(s);
        } catch (IOException e) {//exception catch 
            System.out.println(e.getMessage());
        }
    }
}
