
public class PartTimeEmployee extends Employee {
	float hourlyRate = 1000;
	float workTime;
	float sal;
	public PartTimeEmployee(int empId, String name, String department,float workTime) {
		super(empId, name, department);
		 
		this.workTime = workTime;
		
	}
	
	public void calculateSalary() {
		
		sal = hourlyRate*workTime*30;
		System.out.println(sal);
		
	}
	
	
	public void displayPartTimeEmp() {
		
		super.diplayEmployee();
		calculateSalary();
	}
	

	
	

}
