package com.strings;

import java.util.Arrays;

public class StringsSubstring {
	public static void main(String[] args) {
		String s="unemployed";
		//System.out.println(s.substring(2)); 
		//System.out.println(s.substring(0,2)); 
		String text= new String("Hello, I am JAVA"); 
		
        String[] sentences = text.split("\\.");
        
        //System.out.println(sentences);
        
        System.out.println(Arrays.toString(sentences));
	}
}
