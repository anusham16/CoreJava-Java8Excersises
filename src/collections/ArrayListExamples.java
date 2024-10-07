package collections;

import java.util.Arrays;

public class ArrayListExamples {


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
}
