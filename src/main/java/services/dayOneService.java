package services;

import entities.dayOneEntity;
import readers.dayOneReader;
import writers.dayOneWriter;

import java.util.List;

public class dayOneService {

    private dayOneEntity firstElf;
    private dayOneEntity secondElf;
    private dayOneEntity thirdElf;

    public void solve(){
        dayOneReader reader = new dayOneReader();
        dayOneWriter writer = new dayOneWriter();
        List<dayOneEntity> elves = reader.read();
        int maxCalories = 0;

        //First Part
        /*
        for (var elf:elves) {
            if(elf.getCalories()>maxCalories){
                maxCalories = elf.getCalories();
            }
        }

         */
        this.firstElf = new dayOneEntity(0);
        this.secondElf = new dayOneEntity(0);
        this.thirdElf = new dayOneEntity(0);

        for (var elf:
             elves) {
            if(smallestElf()==1&&this.firstElf.getCalories()<elf.getCalories()){
                this.firstElf.setCalories(elf.getCalories());
            }
            else if(smallestElf()==2&&this.secondElf.getCalories()<elf.getCalories()){
                this.secondElf.setCalories(elf.getCalories());
            }
            else if(smallestElf()==3&&this.thirdElf.getCalories()<elf.getCalories()){
                this.thirdElf.setCalories(elf.getCalories());
            }
        }

        maxCalories+=this.firstElf.getCalories();
        maxCalories+=this.secondElf.getCalories();
        maxCalories+=this.thirdElf.getCalories();
        writer.write(maxCalories);

    }

    private int smallestElf(){
        if(this.firstElf.getCalories()<=this.secondElf.getCalories()&&this.firstElf.getCalories()<=this.thirdElf.getCalories()){
            return 1;
        }
        else if(this.secondElf.getCalories()<=this.firstElf.getCalories()&&this.secondElf.getCalories()<=this.thirdElf.getCalories()){
            return 2;
        }
        else{
            return 3;
        }
    }

}
