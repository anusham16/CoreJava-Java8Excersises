package java8CodingExcersise;

import java.util.SortedMap;

public class MyThread extends  Thread{
    public void run(){

        System.out.println("inside the run method "+Thread.currentThread().getName());
        for(int i=0;i<5;i++){
            System.out.println("Child Thread "+i);
        }
        System.out.println("Child Thread Ends");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread Starts");
        Thread t = Thread.currentThread();
        System.out.println("Current Thread: " + t.getName());

        MyThread obj=new MyThread();
        obj.start();
        //obj.run();
        System.out.println(obj.getName());

        //obj.join();

        System.out.println("Main Thread Ends");
    }
}
