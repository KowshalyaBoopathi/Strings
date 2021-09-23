package com.strings;

public class StringOperations {
	public static void main(String[] args) {
		String s="Knowledge";    
		System.out.println(s.toUpperCase());   
		System.out.println(s.toLowerCase());    
		System.out.println(s);
		
		System.out.println(s.trim());
		
		System.out.println(s.startsWith("Sa"));   
		System.out.println(s.endsWith(" "));
		
		System.out.println(s.charAt(5));
		
		System.out.println(s.length());
		
		String s3="Knowledge";
		String s1=" Knowledge";
		String s2=s.intern();
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());

		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());


		System.out.println(s==s3);
		System.out.println(s==s2);

		/*int a=10;    
		String s=String.valueOf(a);    
		System.out.println(s+100);*/
		
		String s11="It is an apple.It is a book";      
		String replaceString=s11.replace("It","This");//replaces all occurrences of "Java" to "Kava"      
		System.out.println(replaceString);
	}
}
