/*
 * https://www.hackerrank.com/challenges/counting-valleys/problem
 */
package com.HackerRank.Algorithms;

import java.util.Scanner;

public class CountingValleys 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		//no of steps Gary takes
		
		String s=sc.next();	//string describing his path
		
		int count=0;		//count for no of valleys crossed by Gary
		
		int level=0;		//at sea level
		
		boolean belowSeaLevel = false;
		if(s.length()==n) 
		{
			for(int i=0;i<s.length();i++)
			{
				char c=s.charAt(i);
				
				if(c == 'U')
					level++;
				else
					level--;
				 
				if(!belowSeaLevel && level<0)
				{
					count++;
					belowSeaLevel=true;
				}
				
				if(level>=0)
					belowSeaLevel=false;
				
			}
		}
		System.out.println(count);
		sc.close();
	}

}
