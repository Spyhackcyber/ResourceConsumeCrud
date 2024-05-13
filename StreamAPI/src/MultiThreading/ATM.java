package MultiThreading;

public class ATM extends Thread{

	private HdfscBank hdfcbank;
	
	public ATM(HdfscBank hdfcbank) {
		this.hdfcbank = hdfcbank;
	}
	
	@Override
	public void run() {
		
		hdfcbank.deposit(3000);
		hdfcbank.withdaw(3000);
		
	}
}
