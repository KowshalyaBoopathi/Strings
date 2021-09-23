package com.strings;

public class ImmutableString implements Comparison {
	public static void main(String args[]) {
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equals(s4));
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));

	/*String s="Sachin";
	s=s.concat("'s");
	//System.out.println(m);
	System.out.println(s);*/
	}
}
interface Comparison{
	String s1="Apple";
	String s2="Apple";
	String s3= new String("APPLE");
	String s4="Banana";
}