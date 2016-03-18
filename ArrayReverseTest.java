package com;
//completed on 06/03/2016 sunday borabonda hyderabad
public class ArrayReverseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {9,8,7,6,5,4,3,2,1};
		
		int i=0;
		int j = a.length-1;
		int temp =0;
		for(;i<j;i++,j--)
		{
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}

		for(int k=0;k<a.length;k++)
		{
			System.out.println("array elements are  " +a[k]);
		}
	}

}
