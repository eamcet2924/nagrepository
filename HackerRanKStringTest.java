package com.hacker;

public class HackerRanKStringTest {

	public static void main(String[] args) {
		
		String t = "hackerrank";int len = t.length();
		
		//String s = "hereiamstackerank";int j=0;
		String s = "hackerworld";int j=0;
		for(int i=0;i<s.length()&j<len;i++)
		{
			if(s.substring(i,i+1).equals(t.substring(j,j+1)))
			{
				j++;
				
			}
		}
		
		if(j==len)
		{
			System.out.println("Yes");
		}else
		{
			System.out.println("No");
		}

	}

}
