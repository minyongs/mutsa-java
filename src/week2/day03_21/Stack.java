package week2.day03_21;

import java.util.ArrayList;
import java.util.List;

public class Stack {

 List<Integer> stackList = new ArrayList<>();

 public void push(int s){
     stackList.add(s);
 }

 public Integer pop(){
     stackList.removeLast();
     return stackList.getLast();
 }

 public Integer peek(){
     return stackList.getLast();
 }

 public void isEmpty(){
     if(stackList.isEmpty()) {
         System.out.println("스택이 비어있습니다.");
     }else{
         System.out.println("스택이 비어있지 않습니다.");
     }
 }
}
