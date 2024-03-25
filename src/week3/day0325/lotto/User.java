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
        int cnt = 0;
        while(cnt<6){
            System.out.println((cnt+1) + " 번째 숫자를 픽하세요(0~45)");
            int n = sc.nextInt();
            if(n>=1 && n <=45){
                userPickArr[cnt] = new Ball(n);
                cnt ++;
            }else{
                System.out.println("잘못된 입력입니다.다시 입력하세요.");
            }



        }
       /* for(int i = 0; i<6; i++){

            System.out.println((i+1) + " 번째 숫자를 픽하세요(0~45)");
            userPickArr[i] = new Ball(sc.nextInt());
        }*/
    }
}
