package week3.day0325.lotto;

import java.util.Random;

public class LottoMachine {
    public static final int MAX = 45;
    public Ball[] balls ;
    public Ball[] picked;


    public LottoMachine(){
        balls = new Ball[MAX];
        for(int i = 0 ; i < balls.length; i++){
            balls[i] = new Ball(i+1);
        }
        picked = new Ball[6];
    }

    public void shuffle(){
        Random rnd = new Random();
        for(int i = balls.length-1; i >0 ; i--){
            int index = rnd.nextInt(i+1);

            Ball temp = balls[index];
            balls[index] = balls[i];
            balls[i] =  temp;
        }

    }

    public Ball[] pickBall(){
        for(int i = 0; i < picked.length;i++){
            picked[i] = balls[i];

        }
        return picked;
    }
}
