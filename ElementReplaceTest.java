package com;
//completed on 08/03/2016 tuesday borabonda hyderabad
public class ElementReplaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0,1,2,0,5,3,1,2,0,1,3,5,2,0,3,1,2,2,3,2};
		
		int pre = a[0];int j = a.length -1;int t=0;int i =1;
		
		while(i < a.length-1)
		{
				for( ;i<j;  )
				{
					if(a[i]!=pre)
					{
						if(a[j] == pre )
						{
							a[j] = a[i];
							a[i] = pre; i++;j--;
							
						}else
						{
							j--;
						}
					}else
					{
						i++;
					}
					
				}
				j = a.length -1;
				pre = a[i];
		}
		
		for(int h=0;h<a.length;h++)
		{
		System.out.println("array data is...."+a[h]);
		}
		
	}

}
