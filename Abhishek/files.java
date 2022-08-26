//package Programs;

import java.io.*;
import java.util.Scanner;

class files {
    public static void main(String[] args) {
        try {

            File f = new File("file.txt");
            FileWriter fwriter = new FileWriter("file.txt");
            fwriter.write("Hello\n\nBye");
            System.out.print("Written into file\n");
            fwriter.close();

            Scanner s = new Scanner(f);

            while (s.hasNextLine()) {
                System.out.print(s.nextLine());
            }

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}