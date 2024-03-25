package week3.day0325.main;

import week3.day0325.util.Calculator;

public class CalTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int x = calculator.plus(3, 5);

        System.out.println(x);

        int y = calculator.minus(123,42499);

        System.out.println(y);
    }
}
