/*
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
 */

package com.HackerRank.Algorithms;

import java.util.*;

public class JumpingClouds 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt(); //no of clouds
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		int count = countJump(arr);
		
		System.out.println(count);
		
		sc.close();
	}
	
	static int countJump(int arr[])
	{
		int jump=0, i=0;
		
		while(i< arr.length-3)
		{
			if(arr[i+2]!=0)
				i++;
			else
				i+=2;
			jump++;
		}
		
		return ++jump;
	}

}
