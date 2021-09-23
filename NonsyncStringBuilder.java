package com.strings;

public class NonsyncStringBuilder {

	public static void main(String[] args) {
			StringBuilder s=new StringBuilder("Hello ");  
			s.append("world ");
			System.out.println(s);

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
			System.out.println(s);
			
			StringBuilder s1=new StringBuilder();
			System.out.println(s1.capacity());//16
			s1.append("hi");
			System.out.println(s1.capacity());//16
			s1.append("hi hello how are you");
			System.out.println(s1.capacity());//34
			
			s1.ensureCapacity(30);
			
			System.out.println(s1.capacity());//34
			
			s1.append("hi hello how are you");
			System.out.println(s1.capacity());//70
			
			s1.ensureCapacity(3);
			
			System.out.println(s1.capacity());//70
			
			s1.ensureCapacity(3);
			
			System.out.println(s1.capacity());//70
		}
}
