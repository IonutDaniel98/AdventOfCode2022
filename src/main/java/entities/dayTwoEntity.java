package entities;

public class dayTwoEntity {
    private char opponentChoice;
    private char yourChoice;

    public dayTwoEntity(char a, char b){
        this.opponentChoice = a;
        this.yourChoice = b;
    }

    public char getOpponentChoice(){
        return this.opponentChoice;
    }

    public char getYourChoice() {
        return yourChoice;
    }

    public void setYourChoice(char yourChoice) {
        this.yourChoice = yourChoice;
    }
}
