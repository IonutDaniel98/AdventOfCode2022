package writers;

import java.io.FileWriter;
import java.io.IOException;

public class dayOneWriter {

    public void write(int value){

        try {
            FileWriter myWriter = new FileWriter("src/main/java/files/output.txt");
            myWriter.write(Integer.toString(value));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

}
