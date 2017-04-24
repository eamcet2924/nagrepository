package com.interview;

import java.util.HashMap;
import java.util.Map;

public class CountOfStringUsingMapTest {

	public static void main(String[] args) {
		
		String s = "hgfhsfghhghhhgfhg";
		
		HashMap<String,String>  h = new HashMap<String,String>();
		
		for(int i=0;i<s.length();i++)
		{
				if(h.get(s.substring(i,i+1))==null)
						{
							h.put(s.substring(i,i+1), "1");
						}else
						{
							String val = h.get(s.substring(i,i+1));
							int num = Integer.parseInt(val);
							num++;
							h.put(s.substring(i,i+1), String.valueOf(num));
						}
		}
		
		//iterate hashmap
		
		for(Map.Entry<String, String> e: h.entrySet())
		{
			System.out.println(e.getKey()  +" " +e.getValue());
		}
	}

}
