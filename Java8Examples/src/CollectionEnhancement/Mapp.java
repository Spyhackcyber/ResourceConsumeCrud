package CollectionEnhancement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Mapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> map = new HashMap();

		map.put("a" , 5);
		map.put("b" , 1);
		map.put("c" , 2);
		map.put("d" , 3);
		map.put("e" , 6);
		map.put("f" , 4);
		
		
		
	HashMap<String, Integer> sorted=	map.entrySet().stream().sorted(Map.Entry.comparingByValue()).
			collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e1,LinkedHashMap::new));
	
	System.out.println(sorted);

	HashMap<String, Integer> sortedByKey=	map.entrySet().stream().sorted(Map.Entry.comparingByKey()).
			collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e1,LinkedHashMap::new));
	
	System.out.println(sortedByKey);
	
	List<Integer> list = Arrays.asList(2,23,1,13,201,45);
	
	//2,23,201
	
	List<String> list1 =  list.stream().map(l->l.toString()).filter(l->l.startsWith("2")).collect(Collectors.toList());
	
	System.out.println(list1);
	
	
	
	String s ="Java Programmer";
	
LinkedHashMap<Character, Long>	str=s.toLowerCase().chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(x->x, LinkedHashMap::new, Collectors.counting()));
	
	System.out.println(str);
	
	Character c=str.entrySet().stream().filter(x->x.getValue()>1).map(x->x.getKey()).findFirst().get();
	
	System.out.println(c);
	
Character ctt=str.entrySet().stream().filter(x->x.getValue()==1).map(x->x.getKey()).findFirst().get();
	
	System.out.println(ctt);
	
	
	}

}
