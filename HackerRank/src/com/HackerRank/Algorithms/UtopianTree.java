/*
 * https://www.hackerrank.com/challenges/utopian-tree/problem
 */
package com.HackerRank.Algorithms;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();

		while(t>0)
		{
			int height=1;
			int n=sc.nextInt();
			if(n==0)
				System.out.println(height);
			else
			{
				for (int i = 1; i <= n ; i++) 
				{
					if(i%2!=0)
						height*=2;
					else
						height+=1;
				}
				System.out.println(height);
			}
			t--;
		}
	}

}
