package java8CodingExcersise;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task extends Thread {

    private int number;
    public  Task(int number){
        this.number=number;
    }
    public void run() {
        System.out.println("Task "+number +" started");
        for (int i = number*100; i <= number*100+20; i++) {
            System.out.print( i +" ");
        }
        System.out.println("Task "+number + " is done ");
    }

}
public class ThreadingExamples {


    public static void main(String[] args) throws InterruptedException {

        //ExecutorService service= Executors.newSingleThreadExecutor() ;

        ExecutorService service=Executors.newFixedThreadPool(3);



        service.execute(new Task(1));

        service.execute(new Task(2));

        service.execute(new Task(3));

        service.execute(new Task(4));
        service.execute(new Task(5));
        service.execute(new Task(6));
        service.execute(new Task(7));


        service.shutdown();

//        Task task1 = new Task(10);
//        task1.start();
//       // task1.join();
//
//        //System.out.println("Task one is done");
//        Task task2 = new Task(20);
//        task2.start();
//       // task2.join();
//
//        Task task3 = new Task(30);
//        task3.start();
//        task3.join();

//        for(int i=1;i<5;i++) {
//            System.out.println("Main: helloo from main thread");
//        }

    }
}
