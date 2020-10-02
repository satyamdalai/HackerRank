/*
 * https://www.hackerrank.com/challenges/angry-professor/problem
 */
package com.HackerRank.Algorithms;
import java.util.Scanner;

public class AngryProfessor 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			
			int count = 0; //count for no of present on and before time
			
			for (int i = 0; i < a.length; i++) {
				if(a[i] <= 0) count++;
			}
			
			if(count >= k)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
		sc.close();
	}
}
