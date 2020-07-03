/*
 * https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
 */
package com.HackerRank.Algorithms;
import java.util.Scanner;

public class Beautiful_Days_at_the_Movies {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		int count = 0; //count of beautiful days
		for(int x=i; x<=j; x++)
		{
			int rev=0;
			int n=x;
			while(n>0)
			{
				rev = rev*10 + n%10;
				n=n/10;
			}
			if(Math.abs(x-rev)%k ==0)
				count++;
		}
		System.out.println(count);
	}

}
