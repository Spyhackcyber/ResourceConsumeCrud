package ThreadPoolExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
	
	public static void main(String[] args) {
	// Fixed Thread Pool
	
	ExecutorService ex = Executors.newFixedThreadPool(3);
	ex.execute(null);
	//ex.submit(null);

}
}
 