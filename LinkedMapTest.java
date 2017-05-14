package com.map;



class Ob
{
	private Object key;
	private Object value;
	public Ob next;
	
	//Ob root,root1,temp=null;
	
	public Object getKey() {
		return key;
	}
	public void setKey(Object key) {
		this.key = key;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	
	
	Ob()
	{
		
	}
	Ob(Object key,Object value,Ob next)
	{
		this.key=key;
		this.value=value;
		this.next = null;
	}
			
}
class Mapp
{
	private Ob  a[][] = new Ob[10][10];
	private int hc;
	
	Ob root,root1,temp=null;
	void put(Ob obj)
	{
		 hc = obj.getKey().hashCode();
		hc = hc%10;
		//System.out.println("hashcode is...." +hc);
		int pos = 0;
		while(a[hc][pos]!=null)
		{
			pos++;
		}
		a[hc][pos] = obj;
		
		//
		
		if(root == null)
		{
			root = obj;
			root1 = root;
		}else
		{
			temp = obj;
			root1.next = temp;
			root1 = root1.next;
		}
	
	}
	
	Ob get(Object o)
	{
		 hc = o.hashCode();
		 hc = hc%10;
		boolean findObject = false;
		int s=0;
		Ob obr = null;
		while(!findObject&s<10)
		{
			Ob obj = a[hc][s];
			if(o.equals(obj.getKey()))
			{
				findObject = true;
				obr = obj;
			}
			s++;
		}
		
		return obr;
	}
	
	void display()
	{
		for(int i=0;i<10;i++)
		{
			int pos = 0;
			while(a[i][pos]!=null)
			{
				Ob o = a[i][pos];pos++;
				System.out.println("object key is " +o.getKey());
				System.out.println("object value is " +o.getValue());
				System.out.println();
			}
		}
	}
	
	void linkeddisplay()
	{
		while(root!=null)
		{
			System.out.println("linked key is    " +root.getKey());
			System.out.println("linked value is  " +root.getValue());
			System.out.println();
			root = root.next;
		}
	}
}
public class LinkedMapTest {

	public static void main(String[] args) {
		
		Mapp p = new Mapp();
		
		Ob o = new Ob("nag","puri",null);
		Ob o1 = new Ob("nag1","puri1",null);
		Ob o2 = new Ob("nag2","puri2",null);
		Ob o3 = new Ob("nag3","puri3",null);
		
		p.put(o);
		p.put(o1);
		p.put(o2);
		p.put(o3);
		
		
		//Ob test = p.get("nag3");
		
		//System.out.println("value is...." +test.getValue());
		
		p.display();
		p.linkeddisplay();
	}

}
