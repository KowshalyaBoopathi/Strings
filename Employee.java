package com.strings;

public final class Employee  { 
	
	final String number;
	
	public Employee(String number)  {    
		this.number=number;    
	}  
	public String getNumber(){    
		return number;    
	}
	public static void main(String args[])  {  
		Employee e = new Employee("8940130085");  
		String s1 = e.getNumber();  
		System.out.println("Pancard Number: " + s1);  
	 
} 

}    
