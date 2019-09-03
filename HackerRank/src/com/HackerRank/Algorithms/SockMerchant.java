/*
 * https://www.hackerrank.com/challenges/sock-merchant/problem
 */

package com.HackerRank.Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class SockMerchant 
{

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n=sc.nextInt();		//no of socks
		int[] ar=new int[n];	//storing type of socks
		input(ar);
		int pairs=solution(ar,n);
		System.out.println(pairs);	//function to count no of pairss
	}
	
	static void input(int[]a)
	{
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();			
		}
	}
	
	static int solution(int[] a, int n)
	{
		//Arrays.sort(a);
	
		int pairs=0;
		int count=0;
		
		/*for (int i : a) {
			System.out.print(i+" ");
		
		}
		*/
		
		for (int i = 0; i < a.length - 1; i++) 
		{
			Arrays.sort(a);
			if(a[i]==a[i+1])
			{
				count+=2;
				i+=1;
			}
			else continue;
			
			if (count%2==0)
				pairs++;
		}
		return pairs;
	}

}
