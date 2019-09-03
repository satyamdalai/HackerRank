/*
 * https://www.hackerrank.com/challenges/drawing-book/problem
 */

package com.HackerRank.Algorithms;

import java.util.Scanner;
public class DrawingBook 
{
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) 
	{
		int n=sc.nextInt();	//no of pages in the book
		int p=sc.nextInt();	//page number to turn to
		
		solution(n,p);
		
	}
	static void solution(int n, int p)
	{
		int front=p/2;
		int rear=0;
		
		if(n%2==1)
			rear=(n-p)/2;
		else
			rear=(int)(Math.ceil((n-p)/2.0));
		
		System.out.println(Math.min(front, rear));
		
	}

}
