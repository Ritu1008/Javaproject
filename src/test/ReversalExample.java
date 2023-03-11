package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "racecar";
		String result = "";
		for(int i=str1.length()-1;i>=0;i--) {
			
			result = result + str1.charAt(i);
		}

		System.out.println("resversed string is " + result);
		
		if(str1.equals(result)) {
			
			System.out.println("the given string is palindrome");
			
		}else {
			
			System.out.println("the given string is not palindrome");
			
		}
		
		String str2 = "david meets john and lily";
		String[] arr = str2.split(" ");
		String result1= "";
		for(int i=arr.length-1;i>=0;i--) {
			result1= result1+arr[i]+" ";
			
		}
		System.out.println("the result is " + result1.trim());
	}

}
