/*
 * https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
 */
package com.HackerRank.Algorithms;

import java.util.Scanner;

public class CatsAndMouse 
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int q=sc.nextInt();
		int ar[]=new int[3];
		for (int i = 0; i < q; i++) 
		{
			ar[0]=sc.nextInt();
			ar[1]=sc.nextInt();
			ar[2]=sc.nextInt();
			
			catAndMouse(ar);
		}
	}
	
	static void catAndMouse(int[] a)
	{
		int x=a[0];
		int y=a[1];
		int z=a[2];
		
		if (Math.abs(x-z)>Math.abs(y-z))
		{
			System.out.println("Cat B");
		}
		else if (Math.abs(x-z)<Math.abs(y-z))
		{
			System.out.println("Cat A");
		}
		else if (Math.abs(x-z)==Math.abs(y-z))
		{
			System.out.println("Mouse C");
		}
		
		
	}

}
