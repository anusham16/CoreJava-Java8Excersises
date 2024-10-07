package multiThreadingExcersises;

public class ControllingMainThread
{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread Starts");
       Thread t = Thread.currentThread();
        System.out.println("Current Thread: " + t.getName());

        childThread obj=new childThread();
       // obj.start();
        obj.run();
        System.out.println(obj.getName());

        obj.join();

        System.out.println("Main Thread Ends");
    }
}

class  childThread extends  Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Child Thread "+i);
        }
        System.out.println("Child Thread Ends");
    }

}
