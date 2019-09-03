/*
 * https://www.hackerrank.com/challenges/migratory-birds/problem
 */
package com.HackerRank.Algorithms;

import java.util.Arrays;
import java.util.Scanner;
public class MigratoryBirds {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n=sc.nextInt();	//no of birds sighted!
		if(n>=5)
		{int arr[]=new int[n];	//array containing all type of birds spotted
		input(arr);
		int type=solution(arr,n);
		System.out.println(type);
		}
	}
	
	static void input(int[] ar)
	{
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i]=sc.nextInt();
		}
	}
	
	static int solution(int[]a,int n)
	{ 
		Arrays.sort(a);
		int res=a[0];
		int max_count=1, curr_count=1;
		
		for(int i=1;i<n;i++)
		{
			if(a[i]==a[i-1])
				curr_count++;
			else
			{	if(curr_count>max_count)
				{
					max_count=curr_count;
					res=a[i-1];
				}
			curr_count=1;
			}
		}
		
		if(curr_count>max_count)
			{
			max_count=curr_count;
			res=a[n-1];
			}
		return res;
    }
}
