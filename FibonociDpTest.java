package com.dp;

public class FibonociDpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[30];
		a[0]= 0;a[1] =1;
		
		int pos = 20;
		
		for(int i=2;i<=pos;i++)
		{
			a[i] = a[i-1]+a[i-2];
		}
		
		for(int j=0;j<=pos;j++)
		{
			System.out.println(a[j]);
		}
	}

}
