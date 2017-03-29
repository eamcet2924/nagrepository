package com.test;

import java.util.HashSet;
import java.util.Set;

public class HelloTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello world");
		
		Set<String> s = new HashSet<String>();
		
		s.add("nag");
		s.add("ravi");
		s.add("shiva");
		s.add("nag");
		s.add("ravi");
		
		for(String  b: s)
		{
			System.out.println(b);
		}
		
	}

}
