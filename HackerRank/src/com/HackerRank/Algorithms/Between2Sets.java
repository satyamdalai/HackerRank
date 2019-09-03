/*
 * https://www.hackerrank.com/challenges/between-two-sets/problem
 */
package com.HackerRank.Algorithms;

import java.util.Scanner;
public class Between2Sets {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
        int n=sc.nextInt(); //no of integers in a
        int m=sc.nextInt(); //no of integers in b
        
        int a[]=new int[n]; //array of integers a
        int b[]=new int[m]; //array of integers b
        
        input(a);
        input(b);
        
        int lcm=findLCM(a);
        int gcf=findGCF(b);
        
        int count=0;
        
        for(int i=lcm,j=2;i<=gcf;i=lcm*j,j++)
        {
            if(gcf%i==0) count ++;
        }
        
        System.out.println(count);
    }
    static void input(int[] a)
    {
        for (int i = 0; i < a.length; i++) 
        {
            a[i]=sc.nextInt();
        }
    }
    
    static int findLCM(int []a)
    {
        int result=a[0];
        for (int i = 1; i < a.length; i++) 
        {
            result=findLCM(result,a[i]);
        }
        return result;
    }
    static int findLCM(int a, int b)
    {
        return (a*b)/findGCF(a,b);
    }
    
    static int findGCF(int[] a)
    {
        int result=a[0];
        for (int i = 1; i < a.length; i++) 
        {
            result=findGCF(result,a[i]);
        }
        return result;
    }
    
    static int findGCF(int a,int b)
    {
        if (a==0) return b;
        else
            return findGCF(b%a,a);
            
    }
}
