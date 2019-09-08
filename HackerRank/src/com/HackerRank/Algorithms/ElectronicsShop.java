/*
 * https://www.hackerrank.com/challenges/electronics-shop/problem
 */
package com.HackerRank.Algorithms;

import java.util.Scanner;

public class ElectronicsShop 
{
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) 
	{
		int b=sc.nextInt();
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int[] keyboards=new int[n];
		int[] drives=new int[m];
		
		input(keyboards);
		input(drives);
		
		int moneySpent=getMoneySpent(keyboards,drives,b);
		System.out.println(moneySpent);
	}
	
	static void input(int[] a)
	{
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
	}
	
	static int getMoneySpent(int[] keyboards, int[] drives, int n)
	{
		   int max=-1;
	       for(int i=keyboards.length-1;i>=0;i--)
	       {
	    	   for(int j=drives.length-1;j>=0;j--)
	           {
	                if(keyboards[i]+drives[j]<=n && max<keyboards[i]+drives[j])
	                max=keyboards[i]+drives[j];
	           }
	       }
	       return max;
	}	

}
