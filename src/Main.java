import collections.ArrayListExamples;
import coreJava.HelloWorld;

import java.util.*;
import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!"+"\n");
        HelloWorld obj=new HelloWorld();
        int target=5;

        ArrayListExamples arryListObj=new ArrayListExamples();
        System.out.println(arryListObj.checkAnagrams("listen","silent"));

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        //myList.stream().map(s->s+" ").filter(s->s.startsWith("3")).forEach(System.out::println);
       //obj.twoSum(arr,target);


        //myList.stream().map(s->s+" ").filter(s->s.startsWith("6")).findAny().ifPresent(System.out::println);

        IntStream.of(1,2,3,4,5)
                .boxed()
                .forEach(n-> System.out.println(n));

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            //System.out.println("i = " + i);
        }
    }
}