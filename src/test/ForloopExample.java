package test;

public class ForloopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int num=1;num<11;num++) {
			
			System.out.println(num);
		}

		System.out.println("End for loop");
		
		for(int num1=10;num1>0;num1-=2) {
			System.out.println(num1);
			
		}
		System.out.println("End of second loop");
	
		int[] arr1 = {2,3,4,6,8,9};
		for(int i=0;i<arr1.length;i++){
			
		System.out.println("element value is " + arr1[i]);
		}
		//for each loop
		for (int val:arr1) {
			System.out.println("value is " +val);
			
		}
		String str1 = "john";
		for(int i=0;i<str1.length();i++) {
			System.out.println("Char value is " + str1.charAt(i));
			
		}
	}
		 
}