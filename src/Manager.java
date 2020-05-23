
public class Manager extends Employee {

	private String deptName;
	
	
	  public Manager(int id, String name, double salary, String deptName) {
	  super(id,name,salary); 
	  this.deptName = deptName;
	  
	  }
	 
	
   
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public void display() {
		System.out.println(getId()+getName()+getSalary()+getDeptName());
	}
}
