package algorithms;

public class MergeSortTest {

	public static void main(String[] args) {
		
		int a[] = {54,98,23,87,14,84,26,86,36,88,12,34,86,21};
		
//		MERGE-SORT (A, p, r)
//
//		    IF p < r                                                    // Check for base case
//		        THEN q = FLOOR[(p + r)/2]                 // Divide step
//		                MERGE (A, p, q)                          // Conquer step.
//		                MERGE (A, q + 1, r)                     // Conquer step.
//		               MERGE (A, p, q, r)                       // Co

		int p=0; int r = a.length;
		
		mergesort(a,p,r);
	}

	private static void mergesort(int[] a, int p, int r) {
		
		int q =0;
			if(p < r)
			{
				 q = (p+r)/2;
				merge(a,p,q);
				merge(a,q+1,r);
				mergetotal(a,p,q,r);
			}
		
	}

	private static void mergetotal(int[] a, int p, int q, int r) {
		// TODO Auto-generated method stub
		
	}

	private static void merge(int[] a, int p, int q) {
		
		
		
		
	}

}
