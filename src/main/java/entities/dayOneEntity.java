package entities;

public class dayOneEntity {
    private int calories;

    public dayOneEntity(int calories){
        this.calories = calories;
    }

    public int getCalories(){
        return this.calories;
    }

    public void setCalories(int calories){
        this.calories = calories;
    }

    public void addCalories(int calories){
        this.calories += calories;
    }
}
