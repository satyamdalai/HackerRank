/*
 * https://www.hackerrank.com/challenges/the-birthday-bar/problem
 */
package com.HackerRank.Algorithms;
import java.util.Scanner;

public class BirthdayChocolate {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n= sc.nextInt();
		int[] s=new int[n]; //numbers on each of square of chocolate
		input(s);
		int d=sc.nextInt(); //Ron's birth day
		int m=sc.nextInt(); //Ron's birth month
		
		if(d>=1 && d<=31 && m>=1 && m<=12)
		{
			int ways=solution(s,d,m);
			System.out.println(ways);
		}
						
	}
	
	static void input(int[] ar)
	{
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i]=sc.nextInt();
		}
	}
	
	static int solution(int[] ar, int d, int m)
	{
		int ways=0;
		int count=0;
		if(m<=ar.length)
			for (int i = 0; i < m; i++) 
			{
				count+=ar[i];
			}
		if(count==d) ways++;
		
		for (int i = 0; i < ar.length-m; i++) 
		{
			count=count-ar[i]+ar[i+m];
			if(count==d) ways++;
		}
		
		return ways;
	}

}
