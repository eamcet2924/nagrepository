package com.sort;

public class QuckSortRecursionTest {

	public static void main(String[] args) {
		
		int a[] = {11,2,45,17,83,47,10,8,18,14,33,65,21,76,31};
		
		int beg = 0;int end  = a.length;
		quicksort(a,beg,end);

	}

	private static void quicksort(int[] a, int beg, int end) {
		
		System.out.println("end ...." +end);
		System.out.println("beg ...." +beg);
	//	System.out.println("result ...." +(end -beg));
		System.out.println(" ");
		while((end - beg) > 1)
		{
			System.out.println("result ...." +(end -beg));
			end = end/2;
			quicksort(a,beg,end);
		}
		return;
	}

}
