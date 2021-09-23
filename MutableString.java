package com.strings;

public class MutableString {
	public static void main(String[] args) {
		/*StringBuffer s=new StringBuffer("Hello ");  
		s.append("world ");
		try {
		s.insert(12,"good");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(s);
		
		s.replace(0, 5, "Welcome");
		System.out.println(s);
		
		s.delete(0,7);
		System.out.println(s);
		
		s.reverse();
		System.out.println(s);*/
		
		StringBuffer s=new StringBuffer();
		System.out.println(s.capacity());//16
		s.append("hi");
		System.out.println(s.capacity());//16
		s.append("hi hello how are you");
		System.out.println(s.capacity());//34
		
		s.ensureCapacity(30);
		
		System.out.println(s.capacity());//34
		
		s.append("hi hello how are you");
		System.out.println(s.capacity());//70
		
		s.ensureCapacity(3);
		
		System.out.println(s.capacity());//70
		
		s.ensureCapacity(3);
		
		System.out.println(s.capacity());//70
	}
}
