/*
 * https://www.hackerrank.com/challenges/bon-appetit/problem
 */
package com.HackerRank.Algorithms;

import java.util.Scanner;

public class BonAppetit 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n=sc.nextInt();		//no of items ordered
		int k=sc.nextInt();		//index of item Anna did not eat
		
		int[] bill=new int[n];	//price of items
		input(bill);
		
		int charged=sc.nextInt();		//amount Bran charged Anna for her share of bill
		int actual=solution(bill,k);	//calculation of actual charge Anna should be charged
		
		if(charged==actual)
			System.out.println("Bon Appetit");
		else
			System.out.println(charged-actual);
	}
	
	static int solution(int[] a, int b)
	{
		int res=0;
		for (int i = 0; i < a.length; i++) 
		{
			res+=a[i];
		}
		res=(res-a[b])/2;
		
		return res;
	}
	
	static void input(int[] a)
	{
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
	}

}
