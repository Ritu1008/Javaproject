package test;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {10,20,30,40,50};
		
		System.out.println("length of the array is" + arr1.length);
		System.out.println("First value inside the array is " + arr1[0]);
		System.out.println("Last value inside the array is " + arr1[arr1.length-1]);
		
		String[] arr2 = {"mon","tue","wed","thu","fri"};
		
		System.out.println("vaalue at third position is " + arr2[2]);
		
		
		String str = "clean world green world ";
		String[] arr3 = str.split(" ");
		
		System.out.println("Total number of word inside the string is " + arr3.length);
		
		

	}

}