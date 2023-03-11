package test;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 50;
		boolean flag = true;
		
				for(int i=2;i<=number/2;i++) {
					
					int rem = number%i;
					
					if(rem==0) {
						
						flag = false;
					break;
					
					}
				}
		
            if(flag == true) {
            	System.out.println("Num is a prime num");
            }else {
            	System.out.println("Num is not a prime num");
            }
	}

}
