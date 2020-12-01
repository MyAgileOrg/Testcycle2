package com.test;

public class test221 {

	public static void main(String[] args) {
		
		System.out.println("hi world");
		test221 t1= new test221();
		t1.reverse("hello");
	}
	
	
	void reverse(String str)
	{
		if((str== null)|| (str.length() <= 1))
		System.out.println(str);
		else
		{System.out.println((str.charAt(str.length()-1)));
			reverse(str.substring(0,str.length()-1));
		}
		
			
}}


