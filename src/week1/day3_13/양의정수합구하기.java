package week1.day3_13;

import java.util.Scanner;

public class 양의정수합구하기 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int c ;
        int sum = 0 ;

        do{
            c = sc.nextInt();
            if(c>0){
                sum += c;
            }
        }while (c!= 0);

        System.out.println("합:" + sum);
        sc.close();
    }
}
