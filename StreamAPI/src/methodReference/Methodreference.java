package methodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Methodreference {
	
	public void m1() {

	       System.out.println("Method is Calling With Instances");

		}
	
	
	public static void m2() {

       System.out.println("Static Method is Calling");

	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methodreference.m2();
		
		List<String> firsrowColoums = new ArrayList<>();
		Collections.addAll(firsrowColoums, "Sl No","Employee Code","Employee Name","Designation","Technology","Email","Phone","Location","Engagement Plan","Exp.");
		System.out.println(firsrowColoums.size());
		
		Methodreference mr = new Methodreference();
		mr.m1();
		
	}

}
