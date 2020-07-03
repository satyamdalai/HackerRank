/*
 * https://www.hackerrank.com/challenges/append-and-delete/problem
 */

package com.HackerRank.Algorithms;
import java.util.Scanner;

//1 test case failed

public class AppendandDelete 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int n = sc.nextInt();
		boolean ans = check(s1,s2,n);
		if(ans)
			System.out.println("Yes");
		else
			System.out.println("No");
		

		
		sc.close();
	}
	static boolean check( String s1, String s2, int n)
	{
		if((s1.length() + s2.length()) <= n)
			return true;
		if(s1.length()<s2.length())
			return false;
		int commonlength=0;
		for(int i=0; i< Math.min(s1.length(), s2.length()); i++)
		{
			if(s1.charAt(i)==s2.charAt(i))
				commonlength+=1;
			else
				break;
		}
		if((s1.length()-commonlength) + (s2.length()-commonlength)<=n)
			return true;
		
		return false;
		
	}

}
