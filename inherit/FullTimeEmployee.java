
public class FullTimeEmployee extends Employee {
	float sal;
	
	public FullTimeEmployee(int empId, String name, String department, float sal ) {
		super(empId, name, department);
		
		this.sal = sal;
		
		
		
	}
	public void displayFullTimeEmp() {
		super.diplayEmployee();
		System.out.println(sal);
		
	}
	
	
	

}
