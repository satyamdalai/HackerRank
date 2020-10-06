/*
 * https://www.hackerrank.com/challenges/alternating-characters/problem
 */

package com.HackerRank.Algorithms;

import java.util.*;

public class AlternatingCharacters {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();

        for (int n = 0; n < t; n++) {
            String s = scanner.next();

            int result = alternatingCharacters(s);

            System.out.println(result);
        }
        scanner.close();

    }

    static int alternatingCharacters(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1))
                count++;
        }
        return count;
    }
}
