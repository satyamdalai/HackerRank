/*
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem
 */

package com.HackerRank.Algorithms;

import java.util.Scanner;

public class JumpingCloudsRevisited 
{
    static int jumpingOnClouds(int[] c, int k) 
    {
        int n = c.length, e=100, i=0;
        
        do
        {
        	e--;
        	i = (i+k)%n; //jump
        	if(c[i]==1)
        		e-=2;
        	
        }while(i!=0);
        
        return e;
    }
    
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		int c[] = new int[n];
		
		for (int i = 0; i < c.length; i++) 
		{
			c[i]= sc.nextInt();
		}
		
        int result = jumpingOnClouds(c, k);
        
        System.out.println(result);
		sc.close();
	}

}
