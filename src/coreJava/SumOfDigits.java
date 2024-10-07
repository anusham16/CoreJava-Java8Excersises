package coreJava;

public class SumOfDigits {
    public int getSumOfDigits(int number) {
        // Write your code here
        if(number<0){
            return -1;
        }
        if(number==0){
            return 0;
        }
        int sum=0;
        while(number>0){
            int rem=number%10;
            sum+=rem;
            number=number/10;
        }
        return sum;

    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Sum of digits: " + new SumOfDigits().getSumOfDigits(number));
    }
}
