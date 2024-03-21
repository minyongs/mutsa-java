package week2.day03_21;

import java.util.Queue;

public class MyQueue {

    private int[] queueArray;

    private int front;

    private int rear;

    private int capacity;

    private int count;



    public MyQueue(int capacity){
        this.capacity = capacity;
        this.queueArray = new int[capacity];
        front = 0 ;
        rear = 0;
        count = 0;
    }
    public void add(int s){

        if(count == capacity){
            System.out.println("큐가 가득 찼습니다");
        }else {
            queueArray[rear] = s;
            rear++;
            count++;
        }
    }

    public int deque(){
        if(count == 0){
            System.out.println("꺼낼 원소가 없습니다.");
            return -1; //int 를 return 해줘야 하기 때문에
        }else{
            int num = queueArray[front];
            front ++ ;
            count --;
            return num;
        }
    }

    public int peek(){
        if(count == 0){
            System.out.println("꺼낼 원소가 없습니다.");
            return -1;
        }else {
            return queueArray[front];

        }

    }


}
