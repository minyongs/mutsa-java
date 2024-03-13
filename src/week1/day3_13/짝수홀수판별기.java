package week1.day3_13;

import java.util.Scanner;

public class 짝수홀수판별기 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean a = evenOrOdd(n);
        if(a){
            System.out.println("짝수입니다.");
        }else {
            System.out.println("홀수입니다.");
        }


    }

    static boolean evenOrOdd(int n){
        if(n % 2 ==0){
            return true;
        }else{
            return false;
        }
    }
}
