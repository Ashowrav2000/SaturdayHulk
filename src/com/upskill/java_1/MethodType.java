package com.upskill.java_1;

public class MethodType extends Variables{
	
/* Types of Methods
	  
	 1. Void Method
	 2. Static Method
	 3. Return Type Method
*/

	public static int hourlyIncome = 70;
	
	public static void main(String[] args) {
		MethodType myObj = new MethodType();
		myObj.annualIncomevoid();
		
		System.out.println("My Monthly Income = " + myObj.monthlyIncomeReturn());
		System.out.println("Company Name is  = " + myObj.CompanyName());
		weeklyIncomeStatic();
		System.out.println("Work From Home =" + workFromHome());
	}
	
	public void annualIncomevoid() {
		int calculateannuaIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income = " + calculateannuaIncome);
	}
		
	public int monthlyIncomeReturn(){
	int calculateMonthlyIncome = hourlyIncome * 180;
	return calculateMonthlyIncome;
	
		
	}
	public static void weeklyIncomeStatic(){
		  int calculateWeeklyIncome = hourlyIncome * 40;
		  System.out.println("My Weekly Income = " + calculateWeeklyIncome);
		}
	
	public String CompanyName(){
		String CompanyName = "Apple";
		return CompanyName;
	}
	
	public static boolean workFromHome(){
		boolean remoteJob = false;
		System.out.println("I will work from Home : " + remoteJob);
		return remoteJob;
	}
	
}
	
	
