//main class for executor framework
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Main{
    public static void main(String[] args) {
        Runnable[] processor= {new Processor("First"), new Processor("Second"), new Processor("Third"), new Processor("Fourth"), new Processor("Fifth"), new Processor2("Sixth"), new Processor2("Seventh"), new Processor2("Eighth")};
        
        ExecutorService executor = Executors.newFixedThreadPool(3);//creates a pool of 3 threads
        for(Runnable p: processor){
            executor.submit(p);//submits the task to the executor for execution
        }
        executor.shutdown();//shuts down the executor after all tasks are completed, else program will not terminate
    }
}