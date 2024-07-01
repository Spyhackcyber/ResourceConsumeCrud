package CollectionEnhancement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class merging_Two_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> list1=Arrays.asList(1,2,3,4);
		
		List<Integer> list2 =Arrays.asList(4,5,6,7);
		
		
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list.add(list1);
		list.add(list2);
		
		System.out.println(list);
		
		
		List<Integer> opList= new ArrayList<Integer>();
		
	  //opList=Stream.of(list1,list2).flatMap(intList->intList.stream()).distinct().collect(Collectors.toList());
		
		opList=list.stream().flatMap(intList->intList.stream()).distinct().collect(Collectors.toList());
		
		System.out.println(opList);
		
		Set<Integer> ChagedopList= null;

	//	ChagedopList= opList.stream().filter(i -> Collections.frequency(list, i) == 1).collect(Collectors.toList());
		
		ChagedopList= opList.stream().collect(Collectors.toSet());
		
		
		
		System.out.println(ChagedopList);
		
		List<Integer> list5=Arrays.asList(1,2,3,4,4,5,7,7);
		
		
		Set<Integer> uniqueNames= new HashSet<>(); 
		Set<Integer> duplicates=list5.stream().filter(name->!uniqueNames.add(name)).collect(Collectors.toSet());
		
		System.out.println(duplicates);
		

		

		
		
		String[]  array= {"aa","bb"};
		
		System.out.println(Arrays.toString(array));
		
		System.out.println(String.join("", array));
		
		System.out.println(String.join(",", array));
		
		
		
		
		
		
	}

}
