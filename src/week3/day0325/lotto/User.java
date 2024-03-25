package week3.day0325.lotto;

import java.util.Scanner;

public class User {

    public Ball[] userPickArr;


    Scanner sc = new Scanner(System.in);
    public User(){
        userPickArr = new Ball[6];
        userPick();
    }
    public void userPick(){
        for(int i = 0; i<6; i++){

            System.out.println((i+1) + " 번째 숫자를 픽하세요(0~45)");
            userPickArr[i] = new Ball(sc.nextInt());
        }
    }
}
