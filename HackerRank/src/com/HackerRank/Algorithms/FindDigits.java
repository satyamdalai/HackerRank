/*
 * https://www.hackerrank.com/challenges/find-digits/problem
 */

package com.HackerRank.Algorithms;
import java.util.Scanner;

public class FindDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t =sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int count=0;
			int num=n;
			while(n!=0)
			{
				int c = n%10;
				if(c!=0 && num%c == 0)
					count++;
				n = n/10;
			}
			System.out.println(count);
			t--;
		}
		sc.close();
	}

}
