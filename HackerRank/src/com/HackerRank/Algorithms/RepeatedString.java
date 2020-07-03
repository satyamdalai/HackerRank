/*
 * https://www.hackerrank.com/challenges/repeated-string/problem
 */

package com.HackerRank.Algorithms;

import java.util.Scanner;

public class RepeatedString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long n = sc.nextLong();
		
		long count = countA(s, n);
		System.out.println(count);
		
		sc.close();
	}
	
	static long countA(String s, long n)
	{
		long count=0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='a')
				count++;
		}
		
		count = (n/s.length())*count;
		long rem = n%s.length();
		
		for (int i = 0; i < rem; i++) 
		{
			if(s.charAt(i)=='a')
				count++;
		}
		
		return count;
	}

}
