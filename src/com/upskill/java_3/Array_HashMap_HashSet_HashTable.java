package com.upskill.java_3;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_HashMap_HashSet_HashTable {

	public static void main(String[] args) {
		
		int age = 25;
		int [] ageHulk = new int[] {25, 30, 35, 40, 45, 50};
		
		// Array index  [0] [1] [2] [3] [4] [5]
		
		System.out.println("Student Age: " + ageHulk[0]);
		System.out.println("Total Student: " + ageHulk.length);
		
		
		String [] NameHulk = new String[] {"Muazzem", "Khaled", "Bashar","Showrav", "Manun"};
		System.out.println("Student Name: " + NameHulk[0]);
		System.out.println(Arrays.toString(NameHulk));
		
		//Multi-Dimentional Array
         int [][] AgeHulkStudents2D = {{20,22,24,26,28}, {31,33,35,37,39}};
		
		System.out.println("Student Age 2D : " + AgeHulkStudents2D[0][1]);
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		Student.put("Muazzem", 35);
		Student.put("Khaled", 25);
		Student.put("Bashar", 27);
		Student.put("Showrav", 20);
		Student.put("Manun", 30);
		
		System.out.println("HashMap Student Age: " + Student.get("Muazzem"));
		
		HashMap<String, String> Country = new HashMap<String, String>();
		Country.put("USA", "Washington DC");
		Country.put("India", "Delhi");
		Country.put("Bangladesh", "Dhaka");
		Country.put("Englad", "London");
		Country.put("France", "Paris");
		
		System.out.println("Country Capital: " + Country.get("Bangladesh"));
		
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		Region.put("BD", "Asia");
		Region.put("USA", "North America");
		Region.put("Senegal", "Africa");
		
		System.out.println("Region: " + Region.get("BD"));
		
		HashSet<String> Car = new HashSet<String>();
		
		Car.add("BMW");
		Car.add("Lexus");
		Car.add("Cadillac");
		Car.add("Audi");
		
		System.out.println("Car: " + Car);

		



		
		

	}

}
