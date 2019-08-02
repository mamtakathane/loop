package com.loop;

public class AAA {
    
	int sid;
	
	AAA(int a){
		
		 
		 System.out.println(a);
    	 
		System.out.println(" i am in const");
     }
     
	
	
	
	  static void m1(){
	    	System.out.println("m1");
	    }
	  
	  
	      void m2(){
    	   
    	   System.out.println("simple method");
       }
      
    
     
     static {
	System.out.println("happy");
   }



	public static void main(String[] args) {
		AAA aa=new AAA(22);
		
		aa.m1();
		aa.m2();
		
		
		
    
	
	
	}
}
	
	
	

