package java8CodingExcersise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccuranceOfEachWord {

    public static  void findOccurance(String str) {

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result.append(str.charAt(i - 1)).append(count);

                count = 1;
                //System.out.println(result);
            }
        }
        result.append(str.charAt(str.length() - 1)).append(count);


        System.out.println("result is "+result.toString());




       Map<String, Long> map=Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        //System.out.println(map);
        map.entrySet().stream().forEach(x-> System.out.print(x.getKey()+x.getValue()));
        String[] arr=str.split("");

        Map<String,Integer>map1=new HashMap<>();
        for(String value:arr){
            if(map1.containsKey(value)){
                map1.put(value,map1.get(value)+1);
                //System.out.println(map1.get(value));
            }
            else {
                map1.put(value,1);
            }

        }
        System.out.println(map1);
//        for(Map.Entry<String,Integer>entry: map1.entrySet()){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }

    }

    public  static void main(String[] args){
        findOccurance("aaabbcca");




    }
}
