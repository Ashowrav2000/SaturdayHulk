package com.upskill.java_6;

public class Exception_TryCatchFinally {
	
	public static void main(String[]args)  {
		
		
		try {
			
		int[] ageHulk = new int[] {30, 28, 27, 26, 30};
		System.out.println("Student Age = " + ageHulk[12]);
		}
		catch(Exception e) {

			
		System.out.println("Array Method Completed");
		e.printStackTrace();
		
	}

}
}