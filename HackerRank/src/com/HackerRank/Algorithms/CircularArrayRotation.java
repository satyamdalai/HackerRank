/*
 * https://www.hackerrank.com/challenges/circular-array-rotation/problem
 */
package com.HackerRank.Algorithms;
import java.util.Scanner;

public class CircularArrayRotation 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt(); //no of elements of the array
		int k =sc.nextInt(); //rotation count
		int q =sc.nextInt(); //no of queries
		int query[] = new int[q];
		int ar[] =new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
		}
		
		for (int i = 0; i < query.length; i++) {
			query[i]=sc.nextInt();
		}
		
		circularRotate(ar,n,k);
		
		for (int x: query) {
			System.out.println(ar[x]);
		}
	}
	static void circularRotate(int a[], int n, int k)
	{
		for(int i =0; i<k; i++)
		{
            int j;
            int temp=a[n-1];
            for (j = n-1; j > 0; j--) 
            {
                a[j] = a[j-1];
            }
            a[j]=temp;
		}
	}

}
