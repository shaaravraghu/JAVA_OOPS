// BufferedReader and BufferedWriter
import java.io.*;
public class BufferedCharExample {
    public static void main(String[] args) {
        try {
            // Writing text with BufferedWriter
            BufferedWriter bw = new BufferedWriter(new FileWriter("textOutput.txt"));
            bw.write("Hello, Java!");
            bw.newLine(); // adds a newline
            bw.write("BufferedWriter writes efficiently.");
            bw.flush();
            bw.close();
            System.out.println("Data written successfully.");
            // Reading text with BufferedReader
            BufferedReader br = new BufferedReader(new FileReader("textOutput.txt"));
            String line;
            System.out.println("Reading from file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// FileWriter and FileReader
import java.io.*;
public class WriterExample {
    public static void main(String[] args) {
        try {
            // Create a FileWriter (creates file if it doesn’t exist)
            Writer writer = new FileWriter("output.txt");

            // Write data
            writer.write("Hello, Java File Handling!\n");
            writer.write("This is written using FileWriter.");

            // Always flush before closing
            writer.flush();
            writer.close();

            System.out.println("Data written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.*;
public class ReaderExample {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("output.txt");

            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// FileOutputStream
import java.io.*;
public class InputStreamExample {
    public static void main(String[] args) {
        try {
            // Create InputStream to read from file
            InputStream input = new FileInputStream("input.txt");

            // Read bytes one by one
            int data;
            while ((data = input.read()) != -1) {
                System.out.print((char) data); // convert byte to char
            }

            // Check available bytes
            System.out.println("\nBytes available: " + input.available());

            // Close the stream
            input.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
