import java.util.Scanner;

public class Emp {
	
	int empno; 
	String empname;
	String designation;
	String dep;
	double salary;
	
	public void readEmpData(){
		Scanner scn = new Scanner(System.in);
		
		
		
		System.out.println("Enter employee id ");
		empno = scn.nextInt();
		
		scn.nextLine();
		System.out.println("Enter Employee name ");
		empname = scn.nextLine();
		
		System.out.println("Enter employee designation ");
		designation = scn.nextLine();
		
		System.out.println("Enter the employee department ");
		dep = scn.nextLine();
		
		System.out.println("Enter the employee salary ");
		salary = scn.nextDouble();
			
	
	}
	
	public void displayEmpData() {
		
		System.out.println(empno);
		System.out.println(empname);
		System.out.println(designation);
		System.out.println(dep);
		System.out.println(salary);
		
	}
	
	public static void main(String arg[]) {
		
		Emp e1 = new Emp();
		
		e1.readEmpData();
		
		e1.displayEmpData();
	}

}
