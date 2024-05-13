package threadPoolCallableFuture;

import java.util.concurrent.Callable;

public class TriggeredEmailPolicy implements Callable<Object>{

	private Customer C;
	
	TriggeredEmailPolicy(Customer C){
		this.C=C;
		
	}
	
/*	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread.currentThread().getName();
		triggeredEmail(C);
		
	}*/
	
	
	public void triggeredEmail(Customer C) {
		System.out.println("Sending Email to Person");
		
		StringBuffer s =new StringBuffer();
		s.append("Hi" + C.customerName);
		s.append("For Policy Number" + C.policyNumber +"Premium is due and amount is"+C.premium);
		s.append("Please Pay Before the Due date to avoid late Charges");
		C.setMessage(s.toString());
		
	}

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		Thread.currentThread().getName();
		triggeredEmail(C);
		return C;
	}

}
 