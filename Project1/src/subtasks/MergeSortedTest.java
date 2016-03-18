package subtasks;

//completed on 17/03/2016 thursday bangalore silkboard pg
public class MergeSortedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {54,76,89,95,99,100};
		int b[] = {15,38,45,67,72,75};
		
		int l = a.length+b.length;
		
		int c[] = new int[l];
		
		int i=0; int j=0;int k =0;
		
		while(i < a.length && j < b.length)
		{
			
			while(a[i] < b[j])
			{
				c[k] = a[i];i++;k++;
				if(i==a.length) break;
			}
			
			while(b[j] < a[i])
			{
				c[k] = b[j];j++;k++;
				if(j==b.length) break;
			}
		}
		
		if(i==a.length)
		{
			while(j<b.length)
			{
				c[k] = b[j];k++;j++;
			}
		}
		
		if(j==b.length)
		{
			while(i<a.length)
				
			{
				c[k] = a[i];k++;i++;
			}
		}

		//sorted array is
		for(int g=0;g<c.length;g++)
		{
			System.out.println("sorted data is  " +c[g]);
		}
	}

}
