package week1.day3_13;

import java.util.Scanner;

public class PickANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int compick = comPick();
      while(true){
          System.out.println("픽하세요");
          int userPick = sc.nextInt();

          boolean c=compare(compick, userPick);
          if(c){
              break;
          }


      }

    }

    static int comPick(){
        int n = (int)(Math.random()*101);
        return n;
    }

    static boolean compare(int comPick , int userPick){
        if(comPick == userPick){
            System.out.println("정답입니다");
            return true;
        }else if(comPick>userPick){
            System.out.println("오답입니다.컴퓨터의 숫자가 더 큽니다.");
            return false;
        }else{
            System.out.println("오답입니다.사용자의 숫자가 더 큽니다.");
            return false;
        }
    }

}
