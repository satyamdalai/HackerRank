/*
 * https://www.hackerrank.com/challenges/compare-the-triplets/problem
 */
package com.HackerRank.Algorithms;

import java.util.Scanner;

public class ComparetheTriplets {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) 
    {
        int[] Alice=new int[3];
        int[] Bob=new int[3];
        
        //storing the scores of Alice and Bob
        input(Alice);
        input(Bob);
        compare(Alice,Bob);
        
    }
    static void input(int[]ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
    }
    static void compare(int[]ar1,int[]ar2)
    {
    	//initialize the score of both as zero in begining
        int user1=0;
        int user2=0;
        
        for(int i=0;i<3;i++)
        {        
            if (ar1[i]>ar2[i])
            user1++;
        else
            if (ar2[i]>ar1[i])
            user2++;
        else
                if(ar1[i]==ar2[i])
            {
            user1+=0;
            user2+=0;
            }
        }    
        
    int score[]= {user1,user2};
    for(int x:score)
    {
        System.out.print(x+" "); //printing the scores
    }
    }

}
