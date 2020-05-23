class Employee{
	private int id;
	private String name;
	private double salary;
	static int count;
	
	
	public Employee(int id){ 
		  this.id =id; count++; 
	} 
	  public Employee(int id,String name, double salary){ 
		  this(id); this.id =id; this.name = name;
		  this.salary =salary; 
	  }
	 
	public void setId(int x) {
		if(x>=1000 && x<=10000)
			id =x;
		else
			System.out.println("Enter a valid id");

	}
	public void setName(String n) {
		name =n;
	}
	public void setSalary(double s) {
		salary =s;
	}	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	
	public double getSalary() {
		return salary;
	}
	
	public static int getCount() {
		return count;
	}
	
		
}

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  Employee e1 = new Employee(999);
		  System.out.println("id ="+e1.getId()+"name="+e1.getName()+"salary="+e1.
		  getSalary()); e1.setId(9000);
		  System.out.println("id ="+e1.getId()+"name="+e1.getName()+"salary="+e1.
		  getSalary()); Employee e2 =new Employee(1000, "Mark", 10000.00);
		  System.out.println("id ="+e2.getId()+"name="+e2.getName()+"salary="+e2.
		  getSalary()); Employee e3 =new Employee(1001, "Paul", 10002.00);
		  System.out.println("id ="+e3.getId()+"name="+e3.getName()+"salary="+e3.
		  getSalary()); System.out.println("no.of employees"+Employee.getCount());
		 
		 
		Manager manager = new Manager(1005, "Rak", 20000.00, "Admin");
		manager.setId(200);
		manager.setName("Ben");
		manager.setSalary(30000.00);
		manager.setDeptName("Tele");
		manager.display();
		Employee e;
		e = new Manager(2000,"Mike", 30000.00, "HR");
		// cannot call child class (manager class) method e.getDeptName()
	    
//		Manager m = new Employee(10,"rr",300); //invalid
//		Manager m = (Manager)new Employee(10,"rr",300); //invalid
		
	}

}
