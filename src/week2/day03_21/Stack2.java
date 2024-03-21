package week2.day03_21;

import java.util.Arrays;

public class Stack2 {

    private int maxSize;

    private int[] stackArray;

    private int top;


  public Stack2(int maxSize){
      this.maxSize = maxSize;
      this.stackArray = new int[maxSize];
      this.top = -1;

  }

  public void push(int s) {
      if (top < maxSize - 1) {
          stackArray[++top] = s;
      } else {
          System.out.println("스택이 가득 찼습니다.");
      }
  }


  public int pop(){
      if(isEmpty()){
          System.out.println("삭제 불가");
          return -1;
      }else {
          return stackArray[top--];
      }
  }

  public int peek(){
      return stackArray[top];
  }

  public boolean isEmpty(){
      if(top == -1){
          return true;
      }else{
          return false;
      }
  }


  public boolean isFull(){
      if(top == maxSize-1){
          return true;
      }else{
          return false;
      }
  }

public void getStackArray(){
    System.out.println(Arrays.toString(stackArray));
}
}
