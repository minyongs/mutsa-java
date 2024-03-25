package week3.day0325.util;

public class Calculator {
    public int plus(int x,int y){
        return x+y;
    }
    public int minus(int x, int y){
        if(x>y){
            return x-y;
        }else{
            return y-x;
        }
    }
}
