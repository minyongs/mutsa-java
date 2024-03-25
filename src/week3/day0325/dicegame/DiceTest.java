package week3.day0325.dicegame;

import week3.day0325.dicegame.Dice;

public class DiceTest {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int cnt =0;
        for(int i = 0 ; i <101;i++){
            if(dice.roll() == 3){
                cnt ++ ;
            }
        }
        System.out.println("3은 총 " + cnt + " 번 나왔습니다.");
    }
}
