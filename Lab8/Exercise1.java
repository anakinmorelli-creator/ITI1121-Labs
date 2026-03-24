import java.io.InputStreamReader;
import java.io.IOException;

public class Exercise1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);

        System.out.println("Enter some characters :");
        char[] buffer = new char[256];
        int numChars = in.read(buffer);

        String result = new String(buffer).trim();
        System.out.println("Characters read are " + result);
    }
}