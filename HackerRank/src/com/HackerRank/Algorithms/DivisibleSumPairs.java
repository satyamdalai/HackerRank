/*
 * https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
 */
package com.HackerRank.Algorithms;
import java.util.Scanner;

public class DivisibleSumPairs {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n=sc.nextInt();	//length of array of integers
		int k=sc.nextInt();	//value of k
		int[]ar=new int[n];	//array of integers initialization
		input(ar);
		int pairs=solution(ar,k);
		System.out.println(pairs);
	}
	
	static void input(int[] ar)	//method to enter values in integer
	{
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i]=sc.nextInt();
		}
	}
	
	static int solution(int[] a,int k)
	{
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if((a[i]+a[j])%k==0) count++;
			}			
		}
		
		return count;
	}
	
	

}
