package test;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Shivam";
		
		String name1 = "John is from US";
		
		System.out.println("Num of chars in string is " + name1.length());
		System.out.println("the 4th char in the string is " + name1.charAt(3));
		System.out.println("the last char in the string is " + name1.charAt(name1.length()-1));
		
		System.out.println("The string in upper case is " + name1.toUpperCase());
		System.out.println("The string in lower case is " + name1.toLowerCase());
		

	}

}
