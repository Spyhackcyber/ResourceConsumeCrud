package CollectionEnhancement;

public class Employee {

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
	
	
	
}
