/*
 * https://www.hackerrank.com/challenges/mini-max-sum/problem
 */
package com.HackerRank.Algorithms;

import java.util.Scanner;

public class MiniMaxSum {
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        long[] arr=new long[5];
        input(arr);
        long sum=sum(arr);
        long max=max(arr);
        long min=min(arr);
        solution(max,min,sum);
        
    }

    static void input(long[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            a[i]=sc.nextLong();
        }
    }
    
    static long sum(long[] a)
    {
        long sum=0;
        for (int i = 0; i < a.length; i++) 
        {
            sum+=a[i];
        }
        return sum;
    }
    static long max(long[] a)
    {
        long max=a[0];
        for (int i = 1; i < a.length; i++) 
        {
            if(a[i]>max)
                max=a[i];
        }
        return max;
    }
    static long min(long[] a)
    {
        long min=a[0];
        for (int i = 1; i < a.length; i++) 
        {
            if(a[i]<min)
                min=a[i];
        }
        return min;
    }
    
    static void solution(long max, long min, long sum)
    {
        System.out.println((sum-max) +" "+ (sum-min));
    }
    

}
