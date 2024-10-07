package java8CodingExcersise;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FrequencyOfEachWord {

    String str="hello Anusha hello are you malyajhgah";
    String[] strToArray=str.split(" ");

    Map<String,Integer> map=new HashMap<>();

    // by using core java
    public void findOccurenceOfEachWord() {
       // System.out.println("string array "+Arrays.toString(strToArray));
        for (String value : strToArray) {
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
                System.out.println("getting values from map " + map.get(value));
            } else {
                map.put(value, 1);
            }
        }
        System.out.println(map);
    }
    public void findOccuranceByJava8(){
        // by using java 8
        Map<String, Long> map = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("from java 8 "+map);
    }


    public static void main(String[] args) {
        FrequencyOfEachWord obj = new FrequencyOfEachWord();
        List<Integer>list=List.of(1,2,3,4,5,6,7,8,9,10);
        list.stream().map(s->s+" ").filter(s->s.startsWith("3")).forEach(System.out::println);
       list.stream().min(Integer::compareTo).ifPresent(System.out::println);
        obj.findOccurenceOfEachWord();
        obj.findOccuranceByJava8();


        IntStream.rangeClosed(1,9).reduce(1,(x,y)->x*y);
        //or
        IntStream.rangeClosed(1,5).reduce((x,y)->x*y).ifPresent(System.out::println);
        System.out.println("sum of given elements "+IntStream.rangeClosed(0,3).reduce(0,(a,b)->a+b));
        IntStream.rangeClosed(1,6).map(x->x*x).boxed().forEach(System.out::println);



    }
}
