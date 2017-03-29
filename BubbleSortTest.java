package com.sort;

public class BubbleSortTest {

	public static void main(String[] args) {
		
		int[] a = {9,8,7,6,5,4,3,2,1,0};
		int temp = 0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j-1] > a[j])
				{
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}

			//display
		
			for(int k=0;k<a.length;k++)
			{
				System.out.println(a[k]);
			}
	}

}
