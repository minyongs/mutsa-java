package week3.day0325.dicegame;

public class Dice {
    private int eye;

    public int roll(){
        eye = (int)(Math.random() * 6) +1;
        return eye;
    }


}
