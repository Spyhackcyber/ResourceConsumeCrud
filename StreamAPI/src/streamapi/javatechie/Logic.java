package streamapi.javatechie;

import java.util.List;
import java.util.stream.Collectors;

public final class Logic {

	
		// TODO Auto-generated method stub

    public static List<Employee> evaluateTaxUsers(String  input)
    {
    	
		/* One Way of Working */
    	
   /* 	if(input.equalsIgnoreCase("TAX"))
    	{
          return	Database.getEmployees().stream().filter(emp->emp.getSalary()>30000).collect(Collectors.toList());
    	}else {
    		return	Database.getEmployees().stream().filter(emp->emp.getSalary()<=30000).collect(Collectors.toList());
    	}
   */
    	
    	return (input.equalsIgnoreCase("TAX")) ?
    	Database.getEmployees().parallelStream().filter(emp->emp.getSalary()>30000).collect(Collectors.toList())
    	:
    	Database.getEmployees().stream().filter(emp->emp.getSalary()<=30000).collect(Collectors.toList());
    	
    	
    	
    }
		
    public static void main(String[] args) {
    	System.out.println(evaluateTaxUsers("TAX")+"\n");
    	System.out.println();
	}

}
