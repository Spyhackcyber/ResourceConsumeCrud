package CollectionEnhancement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;




public class streamgroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------------------");
		
		List<String> stringList = new ArrayList<String>();
		stringList.add("Karthik");
		stringList.add("Karthik");
		stringList.add("Amit");
		stringList.add("Naman");
		stringList.add("Kamal");
		stringList.add("Kajanl");
		stringList.add("Rohan");
		stringList.add("Rohan");
		stringList.add("Rohan");
		
		
		System.out.println(stringList.stream().collect(Collectors.groupingBy(p->p, Collectors.counting())));
		
		List<Employee> emplist2= new ArrayList<Employee>();
		
		emplist2.add(new Employee(1234, "Amit"));
		emplist2.add(new Employee(1245, "Sumit"));
		emplist2.add(new Employee(1223, "Naman"));
		emplist2.add(new Employee(1223, "Raman"));
		emplist2.add(new Employee(1226, "Sunil"));
		emplist2.add(new Employee(1227, "Jitu"));
		emplist2.add(new Employee(1228, "Karna"));
		
		System.out.println(emplist2.stream().collect(Collectors.groupingBy(p->p.getEmpId(), Collectors.counting())));
		
		System.out.println(emplist2.stream().collect(Collectors.groupingBy(p->p.getEmpId(), Collectors.toList())));
		
		Map<Integer, List<Employee>> map = emplist2.stream().collect(Collectors.groupingBy(p->p.getEmpId(), Collectors.toList()));
		System.out.println(map);
		
		
		
		
		System.out.println(emplist2.stream().collect(Collectors.groupingBy(p->p.getEmpId(), Collectors.toList())));
		
		
		
		DoubleSummaryStatistics d = (DoubleSummaryStatistics) emplist2.stream().collect(Collectors.summarizingDouble(p->p.getEmpId()));
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println(d.getCount());
		System.out.println(d.getMin());
		System.out.println(d.getMax());
		System.out.println(d.getSum());
		System.out.println(d);
		
		/*
		 * Limit Skip
		 */
		List<Integer> emp = emplist2.stream().map((i)->i.getEmpId()).collect(Collectors.toList());
		
	
		System.out.println(emp);
		
		Set<Integer> distinctVoucher = emp.parallelStream().filter(i -> Collections.frequency(emp, i) > 1)
				.collect(Collectors.toSet());

	
		System.out.println(distinctVoucher);

		

		
		List<Integer> l= new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(50);
		l.add(40);
		
		
		//Short Circuit Intermediate Operations.
		
		System.out.println(l);
		
		System.out.println(emplist2);
		
		System.out.println(l.stream().limit(4));
		
		l.stream().limit(4).forEach(p->System.out.println(p));
		
		l.stream().limit(4).filter(p->p>10).forEach(p->System.out.println(p));
		
		System.out.println("--------------------------------------------------------------------------------------");
		l.parallelStream().sorted(Collections.reverseOrder()).distinct().limit(3).skip(1).forEach(p->System.out.println(p));
		
		
		//Write a Program to Find 2nd Smallest Number 
		
		System.out.println("--------------------------------------------------------------------------------------");
		l.parallelStream().sorted().distinct().limit(2).skip(1).forEach(p->System.out.println(p));
		
		
		
		System.out.println("--------------------------------------------------------------------------------------");
		//Write a Program to Print First Number in Given Array

		System.out.println(l.get(1));
		
		System.out.println(l.stream().findFirst().get());
		System.out.println(l.stream().findAny());
		
		//ForEachOrdered
		//ForEach
		//FlatMap
		//Reduce
		
		//Difference Between Map and Flat Map
		
		System.out.println("--------------------------------------------------------------------------------------");
		
		
		List<String> l1=new ArrayList<String>();
		
		l1.add("Karthik");
		l1.add("Karan");
		
		
		System.out.println(l1);
		
       List<String> l2=new ArrayList<String>();
		
		l2.add("Amit");
		l2.add("Aman");
		System.out.println(l2);
		
	     List<List<String>> l3=new ArrayList<>();
			
			l3.add(l1);
			l3.add(l2);
			System.out.println(l3);
		
		// Provide one to Many Mapping
	     List<String> l4=	l3.stream().flatMap(p->p.stream()).collect(Collectors.toList());
		
		 System.out.println(l4);
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
