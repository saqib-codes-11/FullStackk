package multithreading;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task implements Callable {

   @Override
   public String call() throws Exception {
      System.out.println("In call");
      String name = "test";
      return name;
   }
}

public class CallableExample {
	   public static void main(String args[]) throws InterruptedException, ExecutionException {
	      ExecutorService services = Executors.newSingleThreadExecutor();
	      Future<?> future = services.submit(new Task());
	      System.out.println("In Future Object" + future.get());
	   }
	}