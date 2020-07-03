/*
 * https://www.hackerrank.com/challenges/sherlock-and-squares/problem
 */

package com.HackerRank.Algorithms;

import java.util.Scanner;

public class SherlockandSquares 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t>0)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int count=0;
			
			System.out.println ((int)(Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1));
			t--;
		}
		
		sc.close();
	}

}
