import java.io.BufferedWriter; //To write using the buffer(temeporary storage in memory) internal .So more operations can be done 
import java.io.File;//File package 
import java.io.FileOutputStream;//to print the op on teh file 
import java.io.FileWriter;//same as a buffer writter 
import java.io.IOException;//to control exceptions 
import java.io.OutputStream;//to print or write data
public class WriteFile1 {

    public static void main(String[] args) {
        String data = "Hello welcome to create a file using IOSteam";//what to write inside the file 
        String data1 = "This is done using a Output Stream .";
        int noOfLines = 10000;//specify the size 
        
        // Use Streams when you are dealing with any data
        try(OutputStream os = new FileOutputStream(new File("/Users/melo-pt6747/Desktop/create.txt"))) /*  specify the place you want to store */
        {
            os.write(data.getBytes(), 0, data.length());//writing data and usuing the function getbytes in the form of strings 
            os.write(data1.getBytes(), 0, data1.length());
        } catch (IOException e) { // to catch the exception thrown 
            e.printStackTrace();
        }
    }
}
