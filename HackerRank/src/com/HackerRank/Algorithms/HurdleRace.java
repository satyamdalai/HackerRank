/*
 * https://www.hackerrank.com/challenges/the-hurdle-race/problem
 */
package com.HackerRank.Algorithms;

import java.util.Scanner;

public class HurdleRace 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int height[]=new int[n];
		for (int i = 0; i < height.length; i++) {
			height[i]=sc.nextInt();
		}
		
		int max=arrayMax(height);
		int doses=0;
		if(max>k)
			doses=max-k;
		System.out.println(doses);
	}
	
	static int arrayMax(int arr[] )
	{
		int max=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}

}
