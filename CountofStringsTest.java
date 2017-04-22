package com.interview;

import java.util.ArrayList;

public class CountofStringsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hgfhsfghhghhhgfhg";
		
		ArrayList<String> ar = new ArrayList<String>();
		
		int a[] =  new int[20];

		for(int i=0;i<s.length();i++)
		{
				if(!ar.contains(s.substring(i,i+1)))
				{
					ar.add(s.substring(i,i+1));
					
				}else
				{
					int index = ar.indexOf(s.substring(i,i+1));
					a[index] = a[index]+1;
				}
		}
		
		for(int j=0;j<ar.size();j++)
		{
				int count = a[j]+1;
				System.out.println(ar.get(j) +" "+count);
			
		}

	}

}
