package com.upskill.java_2;

public class Loops {
	/* 
	 Type of Loops
	 1. For Loop
	 2. While Loop
	 3. Do While Loop
	 4. Infinite Loop
	 */

	public static void main(String[] args) {
	//	practiceForLoop();
	//	PracticeWhileLoop();
	//	practiceDoWhileLoop();
	//	practiceInfiniteLoop();
		practiceNestedForLoop();

	}
	
	public static void practiceForLoop(){                   //For Loop - Do again and again up to upper limit
		int i;                                              //Initialize the variable
		for(i=1; i<=10; i++) {                             //Setting lower limit, Upper limit, Increment or Decrement
			System.out.println("For Loop number = " + i);   //Statement
		}
		
	}
	
	public static void PracticeWhileLoop(){                 //
		int i = 1;
		while (i<=10) {
		
			System.out.println("While Loops number =" + i);
			i++;
			
		}
	}
	
	public static void practiceDoWhileLoop(){
		int i = 1;
		do {
			System.out.println("Do While Loops number = " + i);
			i++; 
			} while (i<=10);	
				
	}

	
	public static void practiceInfiniteLoop(){                   //For Loop - Do again and again up to upper limit
		int i;                                              //Initialize the variable
		for(i=1; ; i++) {                             //Setting lower limit, Upper limit, Increment or Decrement
			System.out.println("Infinite Loop number = " + i);
		}

	}
	
	public static void practiceNestedForLoop(){
		int i;
		int j;
		for (i=1; i<=10; i++) {
			for (j=1; j<=10; j++){
			int multipilicationTable = i * j;
			System.out.print(multipilicationTable + " ");
		}
		System.out.println(" ");
			
		}
			
		}
	}
	
