package java8CodingExcersise;

public class ReverseOfNumber {


    public int reverseNumber(int number){

        String str= String.valueOf(number);
        String reversedStr=new StringBuilder(str).reverse().toString();

        return  Integer.parseInt(reversedStr);


    }

    public static void main(String[] args) {
        ReverseOfNumber reverseOfNumber=new ReverseOfNumber();
        System.out.println(reverseOfNumber.reverseNumber(12345));
        System.out.println(reverseOfNumber.reverseNumber(987654321));
        System.out.println(reverseOfNumber.reverseNumber(123456789));
    }
}
