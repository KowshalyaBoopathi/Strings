package com.strings;

public class TestString {
	public static String concatWithString()    {  
        String t = "Hello";  
        for (int i=0; i<1000; i++){  
            t = t + "world";  
        }  
        return t;
	}
	public static String concatWithStringBuffer(){  
        StringBuffer sb = new StringBuffer("Java");  
        for (int i=0; i<10000; i++){  
            sb.append("World");  
        }  
        return sb.toString();  
    }  
	 public static void main(String[] args){  
	        long startTime = System.currentTimeMillis();  
	        concatWithString();
	        System.out.println((System.currentTimeMillis()-startTime)+"ms");  
	        long startTime1 = System.currentTimeMillis();  
	        concatWithStringBuffer();  
	        System.out.println((System.currentTimeMillis()-startTime1)+"ms");  
	    }
	
	/*public static void main(String args[]){  
        String str="java";  
        System.out.println(str.hashCode());  
        str=str+"tpoint";  
        System.out.println(str.hashCode());  
   
        StringBuffer sb=new StringBuffer("java");  
        System.out.println(sb.hashCode());  
        sb.append("tpoint");  
        System.out.println(sb.hashCode());  
    } */ 
}
