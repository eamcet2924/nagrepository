package com;
//completed on 11/03/2016  friday silkboard bangalore pg
public class SumarrrayElementsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {19,13,11,10,9,7,5,3,1};
		
		int sum = 75;int st = 0;int rs =6;int len = a.length;int count=1;int ne=0;int track =1;
		
		if(sum > a[0])
		{
			 st = a[0];
			 
			 System.out.println("required element " +st);
			 while(rs!=0 )
			 {
				 rs = requiredsumis(st,sum); 
				 ne = scan(a,rs,track);
				 System.out.println("required element " +ne);
				 
				 sum = rs;
				 st = ne;
				 track++;
			 }
			
		}

	}

	private static int scan(int[] a, int rs,int tr) {
		// TODO Auto-generated method stub
		int  t =0;
		for(int i=tr;i<a.length;i++)
		{
			if(a[i] <= rs)
			{
				t = a[i];break;
			}
		}
		return t;
	}

	private static int requiredsumis(int st, int sum) {
		// TODO Auto-generated method stub
		
		int rs = sum-st;
		return rs;
	}

}
