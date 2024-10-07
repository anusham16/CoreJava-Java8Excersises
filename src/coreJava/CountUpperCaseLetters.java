package coreJava;

public class CountUpperCaseLetters {

    public int countUppercaseLetters(String str) {
        // TODO: Write your code here
        int count=0;
        if(str.isEmpty()){
            return 0;
        }
        for(int i=0;i<str.length();i++){
            if( Character.isUpperCase(str.charAt(i)) ){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Number of uppercase letters: " + new CountUpperCaseLetters().countUppercaseLetters(str));
    }
}
