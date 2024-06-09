package CollectionEnhancement;

public class Employee implements Comparable<Employee> {

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + "]";
	}
	private int empId;
	private String ename;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Employee(int empId, String ename) {
		super();
		this.empId = empId;
		this.ename = ename;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return compare(this,o);
	}
	
	public static int compare (Employee e1,Employee e2) {
		return (e1.getEmpId()<e2.getEmpId()?-1:(e1.getEmpId()==e2.getEmpId())?0:1);
		
	}
	
}
