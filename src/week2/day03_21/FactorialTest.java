package week2.day03_21;

public class FactorialTest {
    static int Factorial(int s){
        if(s>0){
            return s *Factorial(s-1);
        }else{
            return 1;
        }
    }


    static int FactorialFor(int s){
        int a = 1;
        for(int i = 1; i <= s; i++){
            a *= i;
        }
        return a;
    }


    public static void main(String[] args) {
        System.out.println(Factorial(5));
        System.out.println(FactorialFor(5));
    }
}
