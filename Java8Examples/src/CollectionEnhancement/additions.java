package CollectionEnhancement;

import java.util.Scanner;

public class additions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="3424223432";
		
		String  s2= "2344242342";
		
		long s3= additions.add(s1,s2);
		
		System.out.println(s3);
		
		
	}
	
	
	public static long add(String s1, String s2) {
		
		CharSequence ch = "ABCDEFGHIJ"; // Contains all Albhabets 
		Long s4 = null;
		if(!s1.contains(ch)&& !s2.contains(ch)) {
			
			s4=Long.parseLong(s1)+Long.parseLong(s2);
		}
		
		return s4;
	}

}
