package coreJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelloWorld {
    public  void twoSum(int arr[],int target) {


        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(7);
        list.remove(6);
        for (int i = 0; i < arr.length; i++) {
            int res = target - arr[i];
            //System.out.println("hello chittie");
            if (map.containsKey(res) && res != arr[i]) {

                map.put(i, arr[i]);

            }

            list.add(res);

        }

        System.out.println(list);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("keys " + entry.getKey() + " Value " + entry.getValue());
        }


    }

}
