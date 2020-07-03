/*
 * https://www.hackerrank.com/challenges/save-the-prisoner/problem
 */
package com.HackerRank.Algorithms;
import java.util.Scanner;

public class Save_the_Prisoner 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // no of test cases
	
	while(t>0) 
	{
		int n = sc.nextInt(); // no of prisoners
		int m = sc.nextInt(); // no of sweets
		int s = sc.nextInt(); // chair begining number
		
		int r = m%n;
		if((r+s-1)%n == 0)
			System.out.println(n);
		else
			System.out.println((r+s-1)%n);
		
		t--;
	}
	}

}
