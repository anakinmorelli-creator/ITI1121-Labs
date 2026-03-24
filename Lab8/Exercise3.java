import java.io.*;

public class Exercise3 {
    public static byte[] getInput() throws Exception {
        System.out.println("enter some text.");
        System.out.println("only 50 bytes i.e. about 2 lines");
        System.out.println("press enter after each line to get input into the program");

        byte[] buffer = new byte[50];
        System.in.read(buffer);
        return buffer;
    }

    public static void main(String args[]) throws Exception {
        byte input[] = getInput();

        OutputStream myOutFile = new FileOutputStream("write.txt");
        for (int i = 0; i < 50; i++) {
            myOutFile.write(input[i]);
        }
        myOutFile.close();

        int size;
        InputStream myInFile = new FileInputStream("write.txt");
        size = myInFile.available();
        System.out.println("reading contents of file write.txt...");
        for (int i = 0; i < size; i++) {
            System.out.print((char) myInFile.read());
        }
        myInFile.close();
    }
}