import java.io.*;

public class Exercise6 {
    public static void main(String[] args) {
        try {
            // Creating the read stream by byte
            InputStream is = new FileInputStream("write.txt");

            // Creating the reading flow by characters
            InputStreamReader reader = new InputStreamReader(is);

            System.out.println("The uppercase characters in your write.txt file are:\n");

            int data = reader.read();
            while (data != -1) {
                System.out.print(Character.toUpperCase((char) data));
                data = reader.read();
            }

            reader.close();

        } catch (IOException e) {
            System.err.println("Error : " + e.getMessage());
        }
    }
}