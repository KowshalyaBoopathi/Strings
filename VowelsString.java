package com.strings;

import java.util.*;

public class VowelsString {

	List<Character> al;

	public VowelsString() {
		al =new ArrayList<>();
		al.add('A'); al.add('a');  
		al.add('E'); al.add('e');  
		al.add('I'); al.add('i');  
		al.add('O'); al.add('o');  
		al.add('U'); al.add('u');
		/*System.out.println(al);
		int l=al.size();
		System.out.println(l);
		char cha=al.get(3);
		System.out.println(cha);*/
	}
	boolean isVowel(char ch){
		for(int i=0;i<al.size();i++) {
			if(ch==al.get(i)) {
				return true;
			}
		}
		return false;
	}
	int countVowel(String s) {
		int count=0;
		int size = s.length();
		//System.out.println(size);
		for(int j=0;j<size;j++){
			char c=s.charAt(j);
			if(isVowel(c)) {
				count++;
			}
		}
		return count;
	}
	public static void main(String args[])   {
		VowelsString obj=new VowelsString();
		String str = "Javatpoint is a great site for learning Java.";    
		int n=obj.countVowel(str);
		System.out.println(n);
	}

}
