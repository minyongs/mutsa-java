package week1.day3_13;

import java.util.Scanner;

public class 온도변환기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int F = calcuate(n);

        System.out.println(F);


    }



    static int calcuate(int n){
        return n *9/5 +32;
    }
}
