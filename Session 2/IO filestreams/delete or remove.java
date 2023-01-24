import java.io.IOException;
import java.nio.file.*;//import a new class 

public class DeleteFileExample {
    public static void main(String[] args) throws IOException {
        // File or Directory to be deleted
       Path path = Paths.get("Users/melo-pt6747/Desktop/create.txt");

        try {
            // Delete file or directory
            Files.delete(path);
            System.out.println("File or directory deleted successfully");
        } catch (NoSuchFileException ex) {
            System.out.printf("No such file or directory: %s\n", path);
        } catch (DirectoryNotEmptyException ex) {
            System.out.printf("Directory %s is not empty\n", path);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
