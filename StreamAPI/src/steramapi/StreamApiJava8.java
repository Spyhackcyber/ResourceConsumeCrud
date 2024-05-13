package steramapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamApiJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       List<String> list = new ArrayList<>();
       list.add("Amit");
       list.add("hi");
       list.add("Rahul");
       list.add("Natraj");
       
		/*
		 * for (String s: list) { System.out.println(s); }
		 */
       
       
       for(String s:list) {
    	   if(s.startsWith("A")) {
    		   System.out.println(s);
    	   }
       }
       
       
       System.out.println("Filter Methodes-------------------");
       
		 list.stream().filter(t->t.startsWith("R")).forEach(t->System.out.println(t));
       
       
       
       
       
       
       
       
       
       
       
       
       
       list.stream().forEach(t->System.out.println(t));
       
       Map<Integer , String> map = new HashMap<>();
       map.put(1,"a");
       map.put(2,"b");
       map.put(3,"c");
       map.put(4,"d");
       map.put(5,"e");
       map.put(6,"f");
       
       map.forEach((key, value)-> System.out.println(key+":"+value));
       
       map.entrySet().stream().forEach(obj->System.out.println(obj));
       
	
       
       System.out.println("Filter Methodes------------------- MAP is Used");
       
       
       
       map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj->System.out.println(obj));
       
       
       
       
       
       
       
	
	}

}
