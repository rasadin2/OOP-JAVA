package Project;

public  abstract class Employee
{
	private int e_id;
	private int e_name;
	private String dept_name;
	private int e_basicSalary;
	
	
public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public int getE_name() {
		return e_name;
	}
	public void setE_name(int e_name) {
		this.e_name = e_name;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public int getE_basicSalary() {
		return e_basicSalary;
	}
	public void setE_basicSalary(int e_basicSalary) {
		this.e_basicSalary = e_basicSalary;
	}
public String attendence() {
	
	return "This is from attendence";
}
public abstract String salary();
}
