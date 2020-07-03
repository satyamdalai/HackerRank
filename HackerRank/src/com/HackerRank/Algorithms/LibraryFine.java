/*
 * https://www.hackerrank.com/challenges/library-fine/problem
 */

package com.HackerRank.Algorithms;

import java.util.*;


public class LibraryFine 
{
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) 
    {
        boolean condition1 = (y1==y2);
        boolean condition2 = (m1==m2);

        if(y1>y2)
            return 10000;
        if(condition1 && (m1>m2))
            return 500*(m1-m2);
        if((condition1 && condition2)&&(d1>d2))
            return 15*(d1-d2);
        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {

        String[] d1M1Y1 = scanner.nextLine().split(" ");

        int d1 = Integer.parseInt(d1M1Y1[0]);

        int m1 = Integer.parseInt(d1M1Y1[1]);

        int y1 = Integer.parseInt(d1M1Y1[2]);

        String[] d2M2Y2 = scanner.nextLine().split(" ");

        int d2 = Integer.parseInt(d2M2Y2[0]);

        int m2 = Integer.parseInt(d2M2Y2[1]);

        int y2 = Integer.parseInt(d2M2Y2[2]);

        int result = libraryFine(d1, m1, y1, d2, m2, y2);
        
        System.out.println(result);

        scanner.close();
    }
}

