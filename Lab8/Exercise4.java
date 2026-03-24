/*Exercise4-LAB8:ITI1121*/

import java.io.*;
public class Exercise4
{
    public static void main(String [] args) throws IOException, FileNotFoundException  {
        InputStreamReader input = null;
        try {
            input = new InputStreamReader( new FileInputStream("data.txt"));
//ou: input = new InputStreamReader ("C:/YOUR PATH/write.txt");
//YOUR PIECE OF THE CODE HERE

        }

//YOUR PIECE OF THE CODE HERE

        finally {
            if ( input != null )
                input.close();
            System.out.println();
            System.out.println("Inside finally");
        }
    }
}
