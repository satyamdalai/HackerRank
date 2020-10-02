/*
 * https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
 */
package com.HackerRank.Algorithms;

import java.util.Scanner;

public class DesignerPdfViewer {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[26];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
		}	
		String s=sc.next();
		int max=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(ar[s.charAt(i)-97]>max)
				max=ar[s.charAt(i)-97]; // 97 is subtracted as ascii value of 'a' is 97. Therefore b is 98 and so on....
		}
		
		System.out.println(max*s.length());
		sc.close();
	}

}
