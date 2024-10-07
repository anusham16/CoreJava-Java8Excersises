package coreJava;

public class FindRightMostDigit {
    public int getRightmostDigit(String str) {

        // TODO: Write your code here
        if(str.isEmpty()){
            return -1;
        }
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                return Character.getNumericValue(ch);
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        String str = "Hello World 123 hello 46";
        System.out.println("Rightmost digit: " + new FindRightMostDigit().getRightmostDigit(str));
    }
}
