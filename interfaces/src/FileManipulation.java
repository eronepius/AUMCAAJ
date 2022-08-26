
// importing the FileWriter class
import java.io.FileWriter;
import java.io.FileReader;

public class FileManipulation {
    public static void main(String args[]) {

        String data = "This is the data in the output file";
        try {
            // Creates a Writer using FileWriter
            FileWriter output = new FileWriter("output.txt");

            // Writes string to the file
            output.write(data);
            System.out.println("Data is written to the file.");

            // Closes the writer
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

        System.out.println("Reading Data From Files");
        char[] array = new char[100];
        try {
            // Creates a reader using the FileReader
            FileReader input = new FileReader("output.txt");

            // Reads characters
            input.read(array);
            System.out.println("Data in the file:");
            System.out.println(array);

            // Closes the reader
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
