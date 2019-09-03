/*
 * https://www.hackerrank.com/challenges/apple-and-orange/problem
 */
package com.HackerRank.Algorithms;

import java.util.Scanner;

public class AppleandOrange {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) 
    {
        int s=sc.nextInt(); //starting point of Sam's house
        int t=sc.nextInt(); //ending point of Sam's house
        
        int a=sc.nextInt(); //location of Apple tree
        int b=sc.nextInt(); //location of Orange tree
        
        int m=sc.nextInt(); //no of Apple's
        int n=sc.nextInt(); //no of Orange's
        
        int[] apples=new int[m]; //distance from which apple's from tree
        int[] oranges=new int[n]; //distance from which orange's from tree
        
        input(apples);
        input(oranges);
    
        napp(apples,s,t,a);
        nora(oranges,s,t,b);
        
    }
    static void input(int []a)
    {
        for (int i = 0; i < a.length; i++) 
        {
            a[i]=sc.nextInt();
        }
    }
    static void napp(int[] app,int s,int t,int a)
    {
        int napp=0;
        for (int i = 0; i < app.length; i++) 
        {
            if((app[i]+a)>=s && (app[i]+a)<=t)
                napp++;
        }
        System.out.println(napp);
    }
    static void nora(int[] ora,int s,int t,int b)
    {
        int nora=0;
        for (int i = 0; i < ora.length; i++) 
        {
            if((ora[i]+b)>=s && (ora[i]+b)<=t)
                nora++;
        }
        System.out.println(nora);
    }
}
