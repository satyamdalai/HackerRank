/*
 * https://www.hackerrank.com/challenges/strange-advertising/problem
 */
package com.HackerRank.Algorithms;
import java.util.Scanner;

public class Viral_Advertising 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int d = sc.nextInt(); // no of days
		int n=5;
		int i=1;
		int liked;
		int cumulative=0;
		while(i<=d)
		{
			liked = (int)Math.floor(n/2);
			n=(n/2)*3;
			cumulative +=liked;
			i++;
		}
		System.out.println(cumulative);
		sc.close();
	}

}
