package base8;

import java.util.*;

public class Testjava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new LinkedList<>();

		// ... add some names to the collection
		names.add("amar");names.add("umar");names.add("anilr");names.add("abhi");names.add("ravi");

		long count = names.stream()
		                  .filter(name -> name.startsWith("a"))
		                  .count();

		System.out.println("count is..." +count);

	}

	//sample codes
	/*
	 int sumOfWeights = blocks.stream()
                      .filter(b -> b.getColor() == Color.RED)
                      .map(b -> b.getWeight())
                      .sum();
	 */
			
}
