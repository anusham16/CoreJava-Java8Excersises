package coreJava;

import java.util.Arrays;

public class CheckAnagrams {

    public boolean checkAnagrams(String str1,String str2){
        if(str1==null || str2==null){
            return  false;
        }
        if(str1.length()!=str2.length()){
            return false;
        }


        char[] charArray1=str1.toLowerCase().toCharArray();
        char[] charArray2=str2.toLowerCase().toCharArray();
        System.out.println(charArray1);
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return  Arrays.equals(charArray1,charArray2);




    }
    //write public static  void main method
    public static void main(String[] args) {
        CheckAnagrams checkAnagrams=new CheckAnagrams();
        System.out.println(checkAnagrams.checkAnagrams("listen","silent"));
        System.out.println(checkAnagrams.checkAnagrams("triangle","integral"));
        System.out.println(checkAnagrams.checkAnagrams("hello","world"));
    }
}
