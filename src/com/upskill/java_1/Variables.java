package com.upskill.java_1;

public class Variables {
	
	public String country = "USA";
	public static String region = "North America";
	
	
	
	// Variables in Java
	// Instance OR Global - variables declared in class level, outside method
	// Local variables - variables declared method
	// Static variables variables belong to class and don't required creating object
	// Method parameter - variables used as method parameter
	
	
	
	public static void main(String[] args) {
		
		ny("Bronx", 500000);
		nj("Exxex");
		fl("palm Beach");
		
		Variables myObj = new Variables();
		System.out.println(myObj.country);
		System.out.println(region);
	
		
	}
   public static void ny(String county, int poplulation){
	   String city = "The Bronx";
	   System.out.println(city);
	   
	   String myCounty = county;
	   System.out.println(myCounty);
	   System.out.println(poplulation);
}  


   
   public static void nj (String county){
	   String city = "Bloomfield";
	   System.out.println(city);
	   
	   String myCounty = county;
	   System.out.println(myCounty);
   }
   public static void fl(String county){
	   String city = "Miami";
	   System.out.println(city);
	   
	   String myCounty = county;
	   System.out.println(myCounty);
   }
   
}
