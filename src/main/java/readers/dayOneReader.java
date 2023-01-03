package readers;

import entities.dayOneEntity;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dayOneReader {
    public List<dayOneEntity> read(){
        ArrayList<dayOneEntity> elves = new ArrayList<>();
        dayOneEntity elf = new dayOneEntity(0);

        try {
            File myObj = new File("src/main/java/files/input.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data.isEmpty()) {
                    dayOneEntity elfForList = new dayOneEntity(elf.getCalories());
                    elves.add(elfForList);
                    System.out.println(elf);
                    elf.setCalories(0);
                }
                else{
                    elf.addCalories(Integer.parseInt(data));
                }
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        elves.add(elf);

        return elves;
    }
}
