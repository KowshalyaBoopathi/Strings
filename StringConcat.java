package com.strings;

import java.util.stream.Collectors;
import java.util.*;

public class StringConcat {
	public static void main(String args[]) {
		//String s="Hello"+" world"; 
		//StringBuilder s=new StringBuilder().append("hello").append(" ").append("world");
		/*String s1="hello";
		String s2="world";
		String s=s1.concat(s2);*/
		/*StringBuilder s1=new StringBuilder("hello");
		StringBuilder s2=new StringBuilder("world");
		StringBuilder s=s1.append(s2);*/
		
		/*String s1="hello";
		String s2="world";
		String s=String.format("%s %s",s1,s2);*/
		
		/*String s1="hello";
		String s2="world";
		String s=String.join(" ",s1,s2);*/
		
		/*StringJoiner s= new StringJoiner(" ");
		s.add("good");
		s.add("morning");*/
		
		 List<String> list = Arrays.asList("good", "morning", "JAVA");  
		    String str = list.stream().collect(Collectors.joining(" "));  
		        System.out.println(str.toString());		   
	}

}
