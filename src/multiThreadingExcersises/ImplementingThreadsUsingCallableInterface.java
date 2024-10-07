package multiThreadingExcersises;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ImplementingThreadsUsingCallableInterface implements Callable<String> {
    private String name;

    @Override
    public String call() throws Exception {

        Thread.sleep(500);
        return "Hello "+name;

    }

    public ImplementingThreadsUsingCallableInterface(String name) {
        //System.out.println("Constructor");
        this.name = name;
    }

    public static void main(String[] args) throws InterruptedException,Exception{
//

        ExecutorService service=Executors.newFixedThreadPool(10);

//        Future<String>welcomeString=service.submit(new ImplementingThreadsUsingCallableInterface("Thread1"));
//        System.out.println(welcomeString.get());
//        System.out.println(welcomeString.isDone());

        // assinging list of tasks
        List<Callable<String>>tasks=List.of(new ImplementingThreadsUsingCallableInterface("Thread2"),
                new ImplementingThreadsUsingCallableInterface("Thread3"),
                new ImplementingThreadsUsingCallableInterface("Thread4"),
                new ImplementingThreadsUsingCallableInterface("Thread5"),
                new ImplementingThreadsUsingCallableInterface("Thread6"),
                new ImplementingThreadsUsingCallableInterface("Thread7"),
                new ImplementingThreadsUsingCallableInterface("Thread8"),
                new ImplementingThreadsUsingCallableInterface("Thread9"),
                new ImplementingThreadsUsingCallableInterface("Thread10"),
                new ImplementingThreadsUsingCallableInterface("Thread11"),
                new ImplementingThreadsUsingCallableInterface("Thread12"),
                new ImplementingThreadsUsingCallableInterface("Thread13"),
                new ImplementingThreadsUsingCallableInterface("Thread14"),
                new ImplementingThreadsUsingCallableInterface("Thread15"),
                new ImplementingThreadsUsingCallableInterface("Thread16"),
                new ImplementingThreadsUsingCallableInterface("Thread17"));

               List<Future<String>>listOfTasks= service.invokeAll(tasks);
        for(Future<String>values:listOfTasks){
            System.out.println(values.get());
        }

        service.shutdown();





    }
}
