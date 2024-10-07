package coreJava;

import java.util.Arrays;

public class ReverseOfAnArray extends Thread{

    public int[] reverseArray(int[] array) {

        // TODO: Write your code here


        int start=0;

        int end=array.length-1;
        int reversedArray[]=new int[array.length];
        while (start<=end) {
            reversedArray[start]=array[end];
            reversedArray[end]=array[start];
            start++;
            end--;
        }
        return reversedArray;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
       // int[] reversedArray = new ReverseOfAnArray().reverseArray(arr);
        System.out.println(Arrays.toString(new ReverseOfAnArray().reverseArray(arr)));
//        for (int i = 0; i < n; i++) {
//            System.out.print(reversedArray[i] + " ");
//        }

    }
}
