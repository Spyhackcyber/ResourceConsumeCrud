package CollectionEnhancement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class CollectionEnhancement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l= new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(50);
		l.add(40);
		
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
		
		
		emplist.removeIf((p)->p.getEname().startsWith("A"));
		
		//Consumer is Used in For Each loop
		emplist.forEach((v)->
		{
			System.out.println(v.getEmpId()+"  "+v.getEname());
		});
		
		
		
	// Write a Program find max id Employee
    System.out.println(emplist.stream().max((t1,t2)->(t1.getEmpId()<t2.getEmpId()?-1:(t1.getEmpId()==t2.getEmpId())?0:1)).get());
		
    // Write a Program find min id Employee	
	System.out.println(emplist.stream().min((t1,t2)->(t1.getEmpId()<t2.getEmpId()?-1:(t1.getEmpId()==t2.getEmpId())?0:1)).get());
    	
	//Write a Program to Sort Numbers in Asc Order
	System.out.println(l.stream().sorted().collect(Collectors.toList()));
	
		

	//Write a Program to Sort Numbers in Desc Order
	System.out.println(l.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));
		
		
		
	//Order ASC number using Using Comparators
	
	System.out.println(l.stream().sorted((t1,t2)->(t1<t2?-1:(t1==t2)?0:1)).collect(Collectors.toList()));
		
		
	//Order DESC number using Using Comparators
	
	System.out.println(l.stream().sorted((t1,t2)->(t1<t2?1:(t1==t2)?0:-1)).collect(Collectors.toList()));	
	
	// Sorted my emplist
	
	
	List<Employee> emplist2= new ArrayList<Employee>();
	
	emplist2.add(new Employee(1234, "Amit"));
	emplist2.add(new Employee(1245, "Sumit"));
	emplist2.add(new Employee(1223, "Naman"));
	//emplist2.add(new Employee(1223, "Raman"));
	emplist2.add(new Employee(1226, "Sunil"));
	emplist2.add(new Employee(1227, "Jitu"));
	emplist2.add(new Employee(1228, "Karna"));
	
	
	emplist2.stream().sorted().forEach((p)-> System.out.println(p));
	
	// Reverse Employee Order on the Basis of Employee Id
	emplist2.stream().sorted(Collections.reverseOrder()).forEach((p)-> System.out.println(p));
	
	
	
	
	//Short Circuit Operations in stream API
	
	
	
	System.out.println(l.stream().distinct());
	
	
	l.stream().distinct().forEach(i->System.out.println(i));
	
	System.out.println("--------------------------------------------------------");
	
	int duplicate_num= (int)(((int)l.size())-l.stream().distinct().count());
	System.out.println(duplicate_num);
	
	
	//Q:-  Write a Program to Convert the given EMplList into HashMap<empId, Emp>
	
	
	
	Map<Integer, Employee> map =emplist2.stream().collect(Collectors.toMap(p->p.getEmpId(), p->p));
	
	
	System.out.println(map);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
