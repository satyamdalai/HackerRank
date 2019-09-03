/*
 * https://www.hackerrank.com/challenges/plus-minus/problem
 */
package com.HackerRank.Algorithms;

import java.util.Scanner;

public class PlusMinus {
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        int s=sc.nextInt();
        int[] arr=new int[s];
        
        input(arr);
        solution(arr,s);
    }
    
    static void input(int[] a)
    {
        for (int i = 0; i < a.length; i++) 
        {
            a[i]=sc.nextInt();
        }
    }
    
    static void solution(int[] a,int s)
    {
        double p=0, n=0, z=0;
        for (int i = 0; i < a.length; i++) 
        {
            if(a[i]>0)
                p++;
            else if(a[i]<0)
                n++;
            else if(a[i]==0)
                z++;
        }
        
        System.out.println(p/s);
        System.out.println(n/s);
        System.out.println(z/s);
    }
    
}

