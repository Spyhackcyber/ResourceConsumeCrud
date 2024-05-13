package MultiThreading;

public class HdfscBank {
	
	int accountBalance;
	
	public HdfscBank(int accountBalance) {
		super();
		this.accountBalance = accountBalance;
	}

	synchronized void  withdaw(int withdrawamount) {
		this.accountBalance=this.accountBalance-withdrawamount;
		System.out.println(this.accountBalance);
	}
	
	synchronized void deposit(int depositeamount) {
		this.accountBalance=this.accountBalance+depositeamount;
		System.out.println(this.accountBalance);
	}
	
	void balance() {
		System.out.println(accountBalance);
	}
	
	
	void profileUpdate() {
		System.out.println("Profile Updated Successfully");
	}

}
