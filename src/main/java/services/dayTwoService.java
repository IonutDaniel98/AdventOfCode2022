package services;

import entities.dayTwoEntity;
import readers.dayTwoReader;
import writers.dayOneWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class dayTwoService {
    public void solve() throws IOException {
        dayTwoReader reader = new dayTwoReader();
        dayOneWriter writer = new dayOneWriter();
        ArrayList<dayTwoEntity> choices = reader.read();
        int score = 0;

        //modify choices
        for(int i=0;i<choices.size();i++){
            if(choices.get(i).getYourChoice()=='X'){
                if(choices.get(i).getOpponentChoice()=='A'){
                    choices.get(i).setYourChoice('Z');
                }
                else if(choices.get(i).getOpponentChoice()=='B'){
                    choices.get(i).setYourChoice('X');
                }
                else{
                    choices.get(i).setYourChoice('Y');
                }
            }
            else if(choices.get(i).getYourChoice()=='Y'){
                if(choices.get(i).getOpponentChoice()=='A'){
                    choices.get(i).setYourChoice('X');
                }
                else if(choices.get(i).getOpponentChoice()=='B'){
                    choices.get(i).setYourChoice('Y');
                }
                else{
                    choices.get(i).setYourChoice('Z');
                }
            }
            else{
                if(choices.get(i).getOpponentChoice()=='A'){
                    choices.get(i).setYourChoice('Y');
                }
                else if(choices.get(i).getOpponentChoice()=='B'){
                    choices.get(i).setYourChoice('Z');
                }
                else{
                    choices.get(i).setYourChoice('X');
                }
            }
        }

        for(var choice:choices){
            if(choice.getOpponentChoice()=='A'){
                if(choice.getYourChoice()=='X'){
                    score+=1;//rock
                    score+=3;//draw
                }
                else if(choice.getYourChoice()=='Y'){
                    score+=2;//paper
                    score+=6;//win
                }
                else{
                    score+=3;//scissors
                }
            }
            else if(choice.getOpponentChoice()=='B'){
                if(choice.getYourChoice()=='X'){
                    score+=1;//rock
                }
                else if(choice.getYourChoice()=='Y'){
                    score+=2;//paper
                    score+=3;//draw
                }
                else{
                    score+=3;//scissors
                    score+=6;//win
                }
            }
            else{
                if(choice.getYourChoice()=='X'){
                    score+=1;//rock
                    score+=6;//win
                }
                else if(choice.getYourChoice()=='Y'){
                    score+=2;//paper
                }
                else{
                    score+=3;//scissors
                    score+=3;//draw
                }
            }
        }
        writer.write(score);
    }
}
