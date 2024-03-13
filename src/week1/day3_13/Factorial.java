package week1.day3_13;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ans = factorial(n);
        System.out.println(ans);

    }


    static int factorial(int n){
        int t=1;
        while(n>=1){
            t *= n;
            n--;
        }
        return t;
    }
}
