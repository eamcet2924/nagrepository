package com.sort;

public class MergeTwoSortedTest {

	public static void main(String[] args) {
		
		int a[] = {12,16,18,20,35,45,67,78};
		int b[] = {15,19,24,27,36,56,79,86};
		
		int c[] = new int[a.length+b.length];
		
		int i=a.length-1;int j=b.length-1;int k =0;
	
	
		//stack st = new stack();
		
		while(i>=0&&j>=0)
		{
			while(a[i]>b[j])
			{
				c[k]= a[i];k++;i--;
				if(i<0)
				{
					break;
				}
			}
			
			if(i>=0)
			{
			while(a[i] < b[j]){
				c[k] = b[j];k++;j--;
				if(j<0)
				{
					break;
				}
			}
			}
		}
		if(i>=0)
		{
			while(i>=0)
			{
				c[k]= a[i];k++;i--;
			}
		}
		if(j>=0)
		{
			while(j>=0)
			{
				c[k]= b[j];k++;j--;
			}
		}
		
		//printing....
		System.out.println("sorted data is...");
		for(int l=c.length-1;l>=0;l--)
		{
			System.out.println(c[l]);
		}
	}

}
