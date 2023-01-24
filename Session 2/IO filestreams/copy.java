import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileStream {
    public static void main(String[] args) throws IOException {

        File source = new File("Users/melo-pt6747/Desktop/Write1.txt");
        File dest = new File("Users/melo-pt6747/Desktop/copy.txt");

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[1024];
            int length;

            while ((length = fis.read(buffer)) > 0) {//first read whats inside the file

                fos.write(buffer,0, length);//copy and write the same content in anotehr file
            }
        }
    }
}
