/*
 * https://www.hackerrank.com/challenges/kangaroo/problem
 */
package com.HackerRank.Algorithms;

import java.util.Scanner;

public class Kangaroo {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        int x1=sc.nextInt();
        int v1=sc.nextInt();
        
        int x2=sc.nextInt();
        int v2=sc.nextInt();
        
        String result=kangaroo(x1,v1,x2,v2);
        System.out.println(result);
        sc.close();
    }
    static String kangaroo(int x1,int v1,int x2,int v2)
    {
        if(x1==x2 && v1==v2)
            return "YES";
        else if(x1==x2 && v1>v2)
            return "NO";
        else if(x1<=x2 && v1<=v2)
            return "NO";
        else if((x1-x2)%(v1-v2)==0)
            return "YES";
        else
            return "NO";
    }
}
