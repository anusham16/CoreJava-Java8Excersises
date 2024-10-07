package coreJava;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Student {

    private String name;
    private String course;

    private List<Integer> marks;

    public Student(String name,String course, List<Integer> marks){
        this.name=name;
        this.course=course;
        this.marks=marks;
    }


    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public Student(String name) {
        this.name = name;
    }




    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course='" + course + '\'' +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public static void main(String[] args){

        List<Integer>marks=Arrays.asList(67,87,98,66,54);

       //marks.stream().filter(m->  m>70).forEach(System.out::println);
        //Student obj=new Student("Anusha","CSE",marks);


        List<Student>students=Arrays.asList(new Student("Abhi","CSE",Arrays.asList(67,87,98,66,54)),
                new Student("Anusha","CSE",Arrays.asList(67,87,98,66,55)),
                new Student("Manu","CSE",Arrays.asList(67,87,98,66,54)),
                new Student("anuSHA","CSE",Arrays.asList(67,87,98,66,54)),
                new Student("Akshith","CSE",Arrays.asList(67,87,98,66,54)),
                new Student("jasmin","CSE",Arrays.asList(67,87,98,66,54)),
                new Student("sweety","CSE",Arrays.asList(67,87,98,66,54)),
                new Student("Anu","CSE",Arrays.asList(67,87,98,66,54)),
                new Student("Anu","CSE",Arrays.asList(67,87,98,66,54)),
                new Student("Anu","CSE",Arrays.asList(67,87,98,66,54)),
                new Student("Anu","CSE",Arrays.asList(67,87,98,66,54)),
                new Student("Anu","CSE",Arrays.asList(67,87,98,66,54)));

        System.out.println(students);
        students.stream().filter(x->x.getName().startsWith("M")).forEach(System.out::println);

        students.stream().map(Student::getName).filter(x->x.length()>=5).forEach(System.out::println);

        //write the code to calculate the average marks of each students
        students.stream().map(Student::getMarks).forEach(x-> System.out.println(x.stream().mapToInt(Integer::intValue).average().orElse(0)));
       // System.out.println(obj);

        //IntStream.range(1,5).map(x->x*x*x).forEach(System.out::println);

        String str="hello Anusha hello are you malyajhgah";
        String[] strToArray=str.split(" ");
        Map<String,Integer>map=new HashMap<>();

        for(String value:strToArray){
            if(map.containsKey(value)){
                map.put(value,map.get(value)+1);
                System.out.println("getting values from map "+map.get(value));
            }
            else{
                map.put(value,1);
            }
        }



        System.out.println("elements of map " +map);


      List<String> names=Arrays.asList(str.split(" "));
      Map<String,Long>result=names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);
      names.stream().map(String::length).forEach(x->System.out.print(x+" "));
      List<Integer>numbers=List.of(1,2,30,4);

        System.out.println("sum of the elements in arralist "+ numbers.stream().mapToLong(x->x*x).sum());
        Optional<Integer>maxEven=numbers.stream().filter(x->x%2==0).min(Integer::compare);
        System.out.println(numbers.stream().filter(x->x%2==0).max(Integer::compare).orElse(0));




       String[] arr=str.split(" ");
       String maxString="";
       for(String s:arr){
           if(s.length()>maxString.length()){
               maxString=s;
           }
       }
        System.out.println("longest word in a given string is: "+maxString);


       ArrayList<Object> elements=new ArrayList<>();
       elements.add(6);
       elements.add("Anusha");
        System.out.println(elements);





    }
}
