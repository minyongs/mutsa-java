package week2.day03_21;

public class MethodTest {
    static void a(){
        b();
        System.out.println("a가할일 실행");
        System.out.println("a종료");
    }

    static void b(){
        c();
        System.out.println("b가 할일 실행");
        System.out.println("b 종료");
    }

    static void c(){
        d();
        System.out.println("c가할일 실행");
        System.out.println("c 종료");
    }

    static void d(){
        System.out.println("d가 할일 실행");
        System.out.println("d 종료");
    }

    public static void main(String[] args) {
        a();
    }
}
