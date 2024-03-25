package week3.day0325.lotto;

import java.util.Arrays;

public class PlayGame {
    public static void main(String[] args) {
        System.out.println("========================로또 게임 시작합니다============================");
        LottoMachine lottoMachine = new LottoMachine();

        lottoMachine.shuffle();
        lottoMachine.pickBall();
        int[] lottoNum = new int[6];

        for(int i = 0 ; i <6; i++){
            lottoNum[i] = lottoMachine.picked[i].getNumber();
        }

        User user = new User();
        int[] userNum = new int[6];

        for(int i = 0 ; i < 6; i ++){
            userNum[i] = user.userPickArr[i].getNumber();
        }


        int cnt =0 ;
        for(int i = 0 ; i < 6; i++){
            if(lottoNum[i] == userNum[i]){
                cnt++;
            }
        }

        System.out.println("당신이 선택한 번호는" + Arrays.toString(userNum) + "입니다.");
        System.out.println("로또생성기가 선택한 번호는" + Arrays.toString(lottoNum) + "입니다.");


        switch (cnt){
            case 0:
                System.out.println("하나도 못맞추셨네요.. 다음 기회에");
                break;
            case 1:
                System.out.println("1개의 숫자를 맞추셨습니다. 꽝!");
                break;

            case 2:
                System.out.println("2개의 숫자를 맞추셨습니다. 꽝!");
                break;

            case 3:
                System.out.println("3개의 숫자를 맞추셨습니다. 꽝!");
                break;
            case 4:
                System.out.println("4개의 숫자를 맞추셨습니다. 꽝!");
                break;
            case 5:
                System.out.println("5개의 숫자를 맞추셨습니다. 2등!");
                break;
            case 6:
                System.out.println("1등!!!!!!!!!!!!!!!!!!!!");
                break;
        }


    }
}
