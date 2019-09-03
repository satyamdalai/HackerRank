/*
 * https://www.hackerrank.com/challenges/a-very-big-sum/problem
 */
package com.HackerRank.Algorithms;
//this is simillar to array sum but the variable taken here are of long type

import java.util.Scanner;
public class AVeryBigSum {
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        int n=sc.nextInt();
        long[] arr=new long[n];    
        
        input(arr);
        long result=solution(arr);
        System.out.println(result);
        
    }
    
    static void input(long[]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextLong();
        }
    }
    static long solution(long[] arr)
    {
        long sum=0;
        for(int i = 0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        return sum;
    }
}
