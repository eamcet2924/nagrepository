package logic;

public class Merge {

	public static void main(String[] args) {
		
		int a[] = {23,45,48,52,65};
		int b[] = {12,20,27,35,42};
		
		int len = a.length+b.length;
		
		int c[] = new int[len];		int i=0;int j=0;int k =0;
		boolean flag = true;
		
		while(flag)
		{
			
				while(a[i] < b[j] & flag)
				{
				c[k] = a[i];k++;
				
						if(i<a.length)
						{
							i++;
						}else
						{
							flag = false;
						}
				}
				
				
			
			
			//
			
				while(b[j] < a[i]&flag)
				{
					c[k] = b[j];
				
						k++;
								if(j<b.length-1)
								{
									j++;
								}else
								{
									flag = false;
								}
			}
		}
		
		//
		if(i==a.length-1)
		{
			while(j<b.length)
			{
				c[k] = b[j];k++;j++;
			}
		}
		
		//
		if(j==b.length-1)
		{
			while(i<a.length)
			{
				c[k] = a[i];k++;i++;
			}
		}
		//
		
		for(int h=0;h<c.length;h++)
		{
			System.out.println("sorted data is  ..." +c[h]);
		}

	}

}
