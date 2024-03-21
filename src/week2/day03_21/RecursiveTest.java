package week2.day03_21;

public class RecursiveTest {
    static void recursive(int n){
        if(n >0) {
            recursive(n-1); // 자기 자신을 호출 , n을 1씩 줄여서 호출
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        recursive(5);
    }
}
