package CollectionEnhancement;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class CollectionEnhancement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l= new ArrayList<>();
		l.add(10);
		l.add(20);
		
		for(int i=0;i<l.size();i++) {
			
		}
		
		//Consumer<Integer> c=	
		System.out.println("Printing Data For Collection Object With Java8");
		l.forEach((x)->{
			System.out.println(x);
			});
		
		
		
		List<Employee> emplist= new ArrayList<Employee>();
		
		emplist.add(new Employee(1234, "Amit"));
		emplist.add(new Employee(1245, "Sumit"));
		emplist.add(new Employee(1223, "Naman"));
		
		
		
		//Consumer is Used in For Each loop
		emplist.forEach((v)->
		{
			System.out.println(v.getEmpId()+"  "+v.getEname());
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
