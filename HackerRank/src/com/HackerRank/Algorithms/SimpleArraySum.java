/*
 * https://www.hackerrank.com/challenges/simple-array-sum/problem
 */
package com.HackerRank.Algorithms;

import java.util.Scanner;

public class SimpleArraySum {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) 
    {
        int n= sc.nextInt();  //enter the size of array
        int[] ar=new int[n];
        input(ar);			  //take input array elements 
        int result=solution(ar);
        System.out.println(result); //print the sum of all array elements
        

    }

    static void input(int[]ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
    }
    
    static int solution(int[] arr)
    {
        int sum=0;
        for(int i = 0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        return sum;
    }
    
}
