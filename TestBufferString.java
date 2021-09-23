package com.strings;

public class TestBufferString {
	/*public static void main(String[] args){  
        long startTime = System.currentTimeMillis();  
        StringBuffer sb = new StringBuffer("Java");  
        for (int i=0; i<10000; i++){  
            sb.append("Tpoint");  
        }  
        System.out.println((System.currentTimeMillis() - startTime) + "ms");  
        long startTime1 = System.currentTimeMillis();  
        StringBuilder sb2 = new StringBuilder("Java");  
        for (int i=0; i<10000; i++){  
            sb2.append("Tpoint");  
        }  
        System.out.println((System.currentTimeMillis() - startTime1) + "ms");  
    } */
	
	public static void main(String args[]){  
		StringBuffer sb=new StringBuffer("java");  
        System.out.println(sb.hashCode());  
        sb.append("tpoint");  
        System.out.println(sb.hashCode());  
   
        StringBuilder sb1=new StringBuilder("java");  
        System.out.println(sb1.hashCode());  
        sb1.append("tpoint");  
        System.out.println(sb1.hashCode()); 
	}
}
