package coreJava;

public class CheckHexaDecimalString {


    public boolean isValidHexaDecimalString(String str) {
        // Write your code here
        if(str.isEmpty()){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if( !Character.isDigit(str.charAt(i)) && (str.charAt(i)<'A' || str.charAt(i)>'F') && (str.charAt(i)<'a' || str.charAt(i)>'f') ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "1A3F";
        System.out.println("Is valid hexadecimal string: " + new CheckHexaDecimalString().isValidHexaDecimalString(str));
    }
}
