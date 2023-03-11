package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Employee emp1 = new Employee();
		emp1.name = "Sweta";
		emp1.EmpId = 1000;
		emp1.DisplayName();
		
		Employee emp2 = new Employee();
		emp2.name = "David";
		emp2.EmpId = 1001;
		emp2.DisplayName();
		
		Employee emp3 = new Employee("Rohan",1002);
		emp3.DisplayName();
		
		Employee.DisplaySalary();*/
		
		System.out.println("***creating ct1");
		Citizen ct1 = new Citizen();
		ct1.age = 50;
		ct1.name = "Mike";
		ct1.SSN = 12345;
		ct1.CountryName = "India";
		ct1.print();
		
		System.out.println("***creating ct2");
		Citizen ct2 = new Citizen("Rahul","India",30,6789);
		ct2.print();

		System.out.println("***creating ct3");
		Insurance obj1 = new Insurance();
		obj1.InsuranceId = 3000;
		obj1.SSN = 9999;
		obj1.print();
		obj1.Print("Hello Class");
		

	}

}
