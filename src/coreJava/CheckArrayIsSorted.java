package coreJava;

import java.util.ArrayList;

public class CheckArrayIsSorted {

    public boolean isSorted(int[] array) {

        // TODO: Write code here
        if(array.length==0 || array.length==1){
            return true;
        }
        int count=0;
        for(int i=0;i<array.length-1;i++){


            if(array[i+1]<array[i]){
                return false;
            }
        }

        return true;

    }
    public ArrayList<Integer> determineMultiples(int number, int limit) {

        // TODO: Write your code here


        ArrayList<Integer> list=new ArrayList<>();
        if(number<=0){
            return list;
        }
        for(int i=1;i<limit;i++){
            if(i%number==0){
                list.add(i);
            }
        }
        return list;
    }
  public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Is array sorted: " + new CheckArrayIsSorted().isSorted(arr));
        System.out.println("Multiples of 5: " + new CheckArrayIsSorted().determineMultiples(5, 20));
    }
}
