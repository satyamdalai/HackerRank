/*
 * https://www.hackerrank.com/challenges/time-conversion/problem
 */
package com.HackerRank.Algorithms;

import java.util.Scanner;

public class TimeConversion {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args)
    {
        String s=sc.next();
        String[]split=s.split(":");
        String hour=split[0];
        String minutes=split[1];
        String seconds=split[2].substring(0,2);
        String format=split[2].substring(2,4);
        
        if(format.equals("AM"))
        {
            if(hour.equals("12"))
                hour="00";
        System.out.println(hour+":"+minutes+":"+seconds);
        }
        else
        {
            if(Integer.parseInt(hour)!=12)
            {
                int h=Integer.parseInt(hour)+12;
                hour=""+h;
            }
            System.out.println(hour+":"+minutes+":"+seconds);
        }
    }
}

