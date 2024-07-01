package CollectionEnhancement;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Interview_Question {
	
	public static void main(String[] args) {
	
	//int[] a= {2,3,4,2,5};

	List<Integer> l = Arrays.asList(2,3,4,2,5,8);
	
	System.out.println(l);
	
int maximum=l.stream().max(Comparator.comparing(Integer::valueOf)).get();
	
System.out.println(maximum);


int minimum=l.stream().min(Comparator.comparing(Integer::valueOf)).get();

System.out.println(minimum);

long count=l.stream().count();

System.out.println(count);

int Sum=l.stream().reduce(0, Integer::sum);

System.out.println(Sum);

	}
}
