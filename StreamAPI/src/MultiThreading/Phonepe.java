package MultiThreading;

public class Phonepe implements Runnable{

	private HdfscBank hdfcbank;
	
	public Phonepe(HdfscBank hdfcbank) {
		this.hdfcbank = hdfcbank;
	}
	
	
	@Override
	public void run() {
		
		hdfcbank.deposit(5000);
		hdfcbank.withdaw(3000);
		
	}
	
	

}
