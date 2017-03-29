package com.arrays;

import java.util.Arrays;

public class MissingElementsTest {

	public static void main(String[] args) {
		
		int[] a = {3,1,6,18,30,15,11,13,12,7,5,17};
		
		Arrays.sort(a);
		System.out.println("missing elements are...");
		for(int k=0;k<a.length-1;k++)
		{
			int temp = a[k]+1;
			while(temp != a[k+1])
				{
				System.out.println(temp);temp++;
				}
	    }
	                                     }
}
