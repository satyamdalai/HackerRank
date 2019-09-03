/*
 * https://www.hackerrank.com/challenges/problem
 */
package com.HackerRank.Algorithms;

import java.util.Scanner;

public class Grading {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) 
    {
        int n=sc.nextInt();
        int[] grades=new int[n];
        input(grades);
        round(grades);
    }
    
    static void input(int[] ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
    }
    
    static void round(int[] ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            int d=ar[i];
            int roff=(((ar[i]/5)+1)*5);
            if(ar[i]<=37)
                ar[i]=d;
            else
            if(ar[i]<40&&ar[i]>40-3)
            {
                ar[i]=roff;
            }
            else
                if(ar[i]>40&&ar[i]>(roff-3))
                    ar[i]=roff;    
                else
                    ar[i]=d;
        }
        for (int i : ar) 
        {
            System.out.println(i);
        }
    }

}
