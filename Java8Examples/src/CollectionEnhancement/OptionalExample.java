package CollectionEnhancement;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Optional<String> s = display("Hi");
		System.out.println(s.isPresent());
		System.out.println(s.isEmpty());
		if(s.isEmpty()) {
			System.out.println(s);
			System.out.println("Not Null");
		}else
		{
			System.out.println(s);
			System.out.println("Null");
		}
		
	    }

	public static Optional<String> display(String i) {
	
		Optional<String> op=Optional.ofNullable(null);
		return op;
	}
	
	
}
