package coreJava;

public class FindSecondLargestNumber {
    public int findSecondLargestElement(int[] array) {
        //TODO: Write your code here

        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        if(array.length<=1){
            return -1;
        }
        for(int value:array){
            if(value>largest){
                secondLargest=largest;
                largest=value;
            }
            else if(value>secondLargest && value!=largest){
                secondLargest=value;
            }
        }
        if(secondLargest==Integer.MIN_VALUE){
            return -1;
        }
        return secondLargest;

    }


    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        System.out.println("Second largest number is: " + new FindSecondLargestNumber().findSecondLargestElement(arr));
    }

}
