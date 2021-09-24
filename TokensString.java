package com.strings;

import java.util.StringTokenizer;

public class TokensString {
	public static void main(String args[]){  
		   /*StringTokenizer st = new StringTokenizer("it is an apple"," ");  
		     while (st.hasMoreTokens()) {  
		         System.out.println(st.nextToken());  
		     } */
		  /* StringTokenizer st = new StringTokenizer("it, is, an, apple");  
		   System.out.println("Next token is : " + st.nextToken(",")); */
		 StringTokenizer st = new StringTokenizer("it is an apple"," ");  
		 System.out.println("Next token is : " + st.countTokens()); 
	     while (st.hasMoreElements()) {  
	         System.out.println(st.nextElement());  
	     } 
	}  
}
