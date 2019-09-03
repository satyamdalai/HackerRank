/*
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
 */
package com.HackerRank.Algorithms;

import java.util.Scanner;
public class BreakingRecords {

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
        int n=sc.nextInt();     //no of scores
        int score[]=new int[n];    //for storing the scores
        input(score);
        
        int low=0,high=0;        //initalization of lowest and highest count
        int vlow=score[0],vhigh=score[0];
        
        for (int i = 0; i < score.length; i++)    //calculation of how many times high score increased and low score decreased
        {
            if(vlow>score[i]) {vlow=score[i]; low++;}
            
            if(vhigh<score[i]) {vhigh=score[i]; high++;}
        }
        
        System.out.println(high+" "+low);
        
        
    }
    
    static void input(int[] a)    //taking the input of scores 
    {
        for (int i = 0; i < a.length; i++) 
        {
            a[i]=sc.nextInt();            
        }
    }

}
