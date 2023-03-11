package oops;

public class Employee {
	
	public String name;
	public int EmpId;
	private static int salary = 50000;
	
	
	
	public Employee() {
		System.out.println("Inside default cons");
		
	}
	
	public Employee(String var1,int var2) {
		
		System.out.println("inside param cons");
		
		name = var1;
		EmpId = var2;
		
	}
	
	
	public void DisplayName() {
		
		System.out.println("Name of the employee is " + name);
	}

	public static void DisplaySalary() {
		System.out.println("Salary of employee is " + salary);
	
	}
	
}
