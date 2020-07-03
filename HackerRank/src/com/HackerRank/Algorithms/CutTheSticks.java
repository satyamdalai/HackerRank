/*
 * https://www.hackerrank.com/challenges/cut-the-sticks/problem
 */

package com.HackerRank.Algorithms;

import java.util.*;

public class CutTheSticks 
{
	static int getmin(ArrayList<Integer> list)
	{
		int min = list.get(0);
		for (Integer x : list) 
		{
			if(x<min)
				min = x;
		}
		return min;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) 
		{
			list.add(sc.nextInt());
		}
		ArrayList<Integer> indexes = new ArrayList<Integer>();
		sc.close();
		boolean check = true;
		while(check)
		{
			int min = getmin(list);
			for(int i=0; i<list.size(); i++)
			{
				list.set(i, list.get(i)-min);
			}
			System.out.println(list);

			for (int i = 0; i < list.size(); i++) 
			{
				if(list.get(i) < 1)
					indexes.add(i);					
			}
			for(int x : indexes)
				System.out.println(x);
			for (int i = 0; i < indexes.size(); i++) 
			{
				list.remove(indexes.get(i));
			}
			indexes.clear();
			if(list.size()==0) check=false;				
		}

	}

}
