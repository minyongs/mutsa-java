package week3.day0326;

public class Car {
    String name;
    int speed;

    public Car(){
        System.out.println("car 생성자 호출");
    }

    public Car(String name,int speed){
        this.name = name;
        this.speed = speed;

    }
}
