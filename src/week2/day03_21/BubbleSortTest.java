package week2.day03_21;

import java.util.Arrays;

public class BubbleSortTest {

    public static void bubbleSort(int[] arr){
      for(int i = 0; i<arr.length -1; i++){
          for(int j = 0; j < arr.length - i -1; j++){
              if(arr[j] > arr[j+1]){
                  swap(arr , j , j+1);
              }
          }


      }
        System.out.println(Arrays.toString(arr));
    }


    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp ;
    }

    public static void main(String[] args) {
        int[] arr= {1,5,6,2,45};
        bubbleSort(arr);


    }
}
