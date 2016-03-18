package com;
//completed on 16/01/2016 saturday proddutur
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abchvhjjhfhfyumnbmnsvvuvvybxzddcbdefsaxz";
		
		char[ ] t = new char[100];int k =0;int pos = 0;
		
		int[ ] p = new int[100];int l = 0;
		
		
		
		for(int i=0;i<s.length();i++)
		{
			
			pos = getpos(t,s.charAt(i));
			
			if(pos==-1)
			{
			t[k] = s.charAt(i);
			p[k] = 1;
			k++;
			}else
			{
				p[pos] = p[pos]+1;
			}
			
		}
		
		
		for(int h=0;h<p.length;h++)
		{
			if(p[h]==1)
			{
				System.out.println("non duplicate element  is ..." +t[h]);
			}
			
		}
			
			
}

	private static int getpos(char[] t, char ch) {
		// TODO Auto-generated method stub
									boolean b = true;int g=0;
									for(;g<t.length&&b;g++)
									{
										if(ch ==t[g] && b)
										{
											
											b = false;
										}
									}
									if(b)
									{
										g = -1;
									}
									if(g>0)
									{
										g = g-1;
									}
									return g;
	}

}
