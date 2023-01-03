package readers;

import entities.dayTwoEntity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class dayTwoReader {

    public ArrayList<dayTwoEntity> read() throws IOException {
        ArrayList<dayTwoEntity> choices = new ArrayList<>();

        File file= new File("src/main/java/files/input.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int c = 0;
        char character1, character2;
        while(c!=-1){
            c=bufferedReader.read();
            character1 = (char) c;
            c=bufferedReader.read();
            c=bufferedReader.read();
            character2=(char) c;
            choices.add(new dayTwoEntity(character1,character2));
            System.out.println(character1);
            System.out.println(character2);
            c=bufferedReader.read();
            c=bufferedReader.read();
        }
        choices.remove(choices.size()-1);
        return choices;
    }
}
