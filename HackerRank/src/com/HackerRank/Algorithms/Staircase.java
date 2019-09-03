/*
 * https://www.hackerrank.com/challenges/staircase/problem
 */
package com.HackerRank.Algorithms;
import java.util.Scanner;

public class Staircase {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n=sc.nextInt();
		solution(n);
	}
	
	static void solution(int s)
	{
		for (int i = 1; i <= s; i++) 
		{
			for (int j = 1; j <= s; j++) 
			{
				if(i+j>s) System.out.print("#");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

}
