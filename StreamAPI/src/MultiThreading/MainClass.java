package MultiThreading;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HdfscBank hdfc= new HdfscBank(7000);
		
		ATM atm = new ATM(hdfc);
		Phonepe phonepe = new Phonepe(hdfc);
		
		Thread t1 =new Thread(phonepe);
		atm.setName("ATM-THREAD");
		t1.setName("PhonePe-THREAD");
		atm.start();
		
		t1.start();
	
		
	}

}
