import java.io.*;

public class Exercise4 {
    public static void main(String[] args) {
        InputStreamReader input = null;
        try {
            input = new InputStreamReader(new FileInputStream("data.txt"));

            int data = input.read();
            while (data != -1) {
                System.out.print((char) data);
                data = input.read();
            }

        } catch (FileNotFoundException e) {
            System.out.println("exception generated: " + e.getClass().getSimpleName());
        } catch (IOException e) {
            System.out.println("exception generated: " + e);
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException e) {
                // handle close error
            }
            System.out.println();
            System.out.println("Inside finally");
        }
    }
}