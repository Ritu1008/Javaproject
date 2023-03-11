package oops;

public class Citizen extends Person {

	public int SSN;
	
	public Citizen() {
		
		System.out.println("Inside default constructor");
	}
	
	public Citizen(String name, String CountryName, int age, int SSN) {
		
		super();
		
		System.out.println("Inside the param constructor ");
		
		this.name = name;
		this.CountryName = CountryName;
		this.age = age;
		this.SSN = SSN;
		
	}
	public void print() {
		System.out.println("SSN is " + SSN);
	}
}
