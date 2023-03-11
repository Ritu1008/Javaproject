package oops;

public class Insurance extends Citizen {

	public int InsuranceId;
	
	public Insurance() {
		
		super();
		System.out.println("Inside default cons of Insurance");
	}
	public void print() {
		
		super.print();
		System.out.println("Insurance Id is " + InsuranceId);
		
	}
        public void Print(String message) {
		
		System.out.println("Typing some message " + message);
		
	}

	}
