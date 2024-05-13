package threadPoolCallableFuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;



public class MultiThreadingForIssurence {

	public static void main(String[] args) {
	//Select * from Policy
	
	Customer C = new Customer("Jiya Brein", "PL9001", 25000.00);
	Customer C1 = new Customer("Paul Niksui", "PL9002", 13500.00);
	Customer C2 = new Customer("Martin Theron", "PL9003", 18000.00);
	Customer C3 = new Customer("Murali Gowda", "PL9004", 32500.00);
	Customer C4 = new Customer("Nima Roy", "PL9005", 22700.00);
	Customer C5 = new Customer("Iqbal Hussain", "PL9006", 10500.00);
	Customer C6 = new Customer("Manu Sharma", "PL9006", 27000.00);
	Customer C7 = new Customer("Wang Liu", "PL9008", 34500.00);
	Customer C8 = new Customer("Amelia Zoe", "PL9009", 11500.00);
	Customer C9 = new Customer("Jaden Dough", "PL9010", 11000.50);
	Customer C10 = new Customer("Jasna Kaur", "PL9011", 15700.00);
	Customer C11 = new Customer("Nitin Joshi", "PL9012", 282000.00);
			
			List<Customer> customerList = new ArrayList<>();
			
			customerList.add(C);
			customerList.add(C1);
			customerList.add(C2);
			customerList.add(C3);
			customerList.add(C4);
			customerList.add(C5);
			customerList.add(C6);
			customerList.add(C7);
			customerList.add(C8);
			customerList.add(C9);
			customerList.add(C10);
			customerList.add(C11);
			
	   //ExecutorService ex=	Executors.newFixedThreadPool(3);
	   List<ScheduledFuture<Object> > t1 = new ArrayList<>();
	   
	   
	   ScheduledExecutorService ex= Executors.newScheduledThreadPool(3);
			
	/*	ExecutorService ex=	Executors.newFixedThreadPool(3, new ThreadFactory(){
		  	int Counter=0;
			@Override
			public Thread newThread(Runnable r) {
				Thread t =new Thread(r);
				t.setName("Thread"+Counter++);
				return t;
			}
		});*/
			
		for (int i = 0; i < customerList.size(); i++) {
			TriggeredEmailPolicy t =new TriggeredEmailPolicy(customerList.get(i));
			ScheduledFuture<Object> Obj =  	ex.schedule(t, 1, TimeUnit.MICROSECONDS);
			
			//Future<Object> Obj =    ex.submit(t);
			t1.add(Obj);
		}
			
	
		
              for (int i = 0; i < t1.size(); i++) {
				
			//	if(t1.get(i).isDone())
			//	{
					try {
						System.out.println(t1.get(i).get().toString());
					}catch (InterruptedException | ExecutionException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					
				
				}
			//}	
		
			
			
			
			
			ex.shutdown();
			
			
			
			
			
			
			
			
			
			
			
			
	
	
}
}