package com.loop;

import java.util.Scanner;

public class xtree {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
			System.out.println("please enter a number");
			int temp=sr.nextInt();
			int x=(temp-1)*2+1;
			int y=x/2;
			int z=1;
			
			for(int i=0; i<temp-1; i++)
			{
				for(int j=0; j<=y; j++)
				{
					System.out.println(" ");
					
				}
				for(int k=0; k<z; k++)
				{
					System.out.print("*");
					
				}
				System.out.println();
				y--;
				z+=2;
				
			}
			for(int i=0; i<=x/2; i++)
			{
				System.out.println(" ");
				
			}
			//System.out.println("*");
	}
}
