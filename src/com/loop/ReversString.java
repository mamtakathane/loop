package com.loop;

public class ReversString {
public static void main(String[] args) {
	String str="javabykiran";
	char[] str1=str.toCharArray();
	
	for(int i=str1.length-1;i>=0;i--)
			{
		        System.out.println(str1[i]);
			}
	System.out.println("");
	StringBuffer sb=new StringBuffer(str);
	System.out.println(sb.reverse());
	
}
	
	
	
}
