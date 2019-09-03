/*
 * https://www.hackerrank.com/challenges/day-of-the-programmer/problem
 */

package com.HackerRank.Algorithms;

import java.util.Scanner;

public class DayofTheProgrammer 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		if(y>=1700 && y<=2700)
		{
			if(y<1918) 												//julian calender
			{
				System.out.println(y%4==0 ?"12.09."+y:"13.09."+y);
			}
			else if(y==1918)										//transition year
			{
				System.out.println("26.09."+y);
			}	
			else													//georgian calender
			{
				System.out.println((y%400==0)||(y%4==0 && y%100!=0) ? "12.09."+y : "13.09."+y);
			}
		}
		sc.close();
	}
}
