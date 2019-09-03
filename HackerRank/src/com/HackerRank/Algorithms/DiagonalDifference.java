/*
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
 */
package com.HackerRank.Algorithms;

import java.util.Scanner;

public class DiagonalDifference {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) 
    {
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        
        input(arr);
        int result=solution(arr,n);
        System.out.println(result);
    }
    
    static void input(int[][]a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    }
    
    static int solution(int[][]a,int n)
    {
        int result=0;
        int d1=0,d2=0;
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a.length; j++) 
            {
                if(i==j)
                    d1+=a[i][j];
                
                if(i==n-j-1)
                    d2+=a[i][j];
            }
        }
        
        result = Math.abs(d1-d2);
        return result;
    }
    
    

}
