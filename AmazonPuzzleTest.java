package com;
//completed on 18/01/2016 monday proddutur
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AmazonPuzzleTest {

	public static void main(String[] args) {
		
		int num = 365421;
		boolean check = true;int temp=0;int pass = 3;int loop = 0;int te =0;
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ArrayList<Integer> br = new ArrayList<Integer>();
		StringBuilder st = new StringBuilder();
		
		String s =  Integer.toString(num);
		
		int len = s.length();
		
		int a[] = new int[len];
		
		for(int i=0;i<len;i++)
		{
			a[i] = Integer.parseInt(Character.toString(s.charAt(i)));
			//System.out.println("char is..." +a[i]);
		}
		
		while(check)
		{
			
					if(a[len-1] > a[len-2])
					{
						//temp = a[len-2];
						//a[len-2] = a[len-1];
						//a[len-1] = temp;
						check = false;
						te = len-2;
					}
			
			
			if(check)
			{
			  loop++;len = len-1;
			}
		}
		
		 /*
			for(int j=len-1;j>len-4;j--)
			{
				ar.add(new Integer(a[j]));
			}*/
			for(int j=te;j<s.length();j++)
			{
				ar.add(new Integer(a[j]));
			}
			Collections.sort(ar);
			//System.out.println("after sorting iterate is..");
			for(Integer p : ar)
			{
				//System.out.println("element is ...." +p);
			}
			int c = a[te];int max = 0;

			for(Integer p : ar)
			{
				//System.out.println("element is ...." +p);
				if(p>c)
				{
					max = p;break;
				}
			}
			
			//System.out.println("max is...." +max);
			if(te-1>=0)
			{
				for(int z=0;z<=te-1;z++)
				{
				br.add(new Integer(a[z]));
				}
			}
			br.add(new Integer(max));
			for(Integer p : ar)
			{
				if(max!=p)
				{
					br.add(new Integer(p));
				}
			}
			
			for(Integer q : br)
			{
				st.append(q);
				//System.out.println("final is...." +q);
			}
			
			System.out.println("final largest number is..." +st.toString());
		

	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		
	


