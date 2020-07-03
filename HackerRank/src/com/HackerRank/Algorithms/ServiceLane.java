/*
 *https://www.hackerrank.com/challenges/service-lane/problem 
 */

package com.HackerRank.Algorithms;
import java.util.Scanner;

public class ServiceLane 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int t =sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		while(t>0)
		{
			int i =sc.nextInt();
			int j =sc.nextInt();
			
			int width = width(i,j, arr);
			System.out.println(width);
			t--;
		}
	}
	
	static int width(int i, int j, int arr[])
	{
		int min = arr[i];
		for (int k = i+1; k <= j; k++) 
		{
			if(arr[k]<min)
				min = arr[k];
		}
		return min;
	}

}
