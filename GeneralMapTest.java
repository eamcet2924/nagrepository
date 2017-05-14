package com.map;

class Ob
{
	private Object key;
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
	private Object value;
	
	Ob()
	{
		
	}
	Ob(Object key,Object value)
	{
		this.key=key;
		this.value=value;
	}
			
}
class Mapp
{
	private Ob  a[][] = new Ob[10][10];
	private int hc;
	void put(Ob obj)
	{
		 hc = obj.getKey().hashCode();
		hc = hc%10;
		System.out.println("hashcode is...." +hc);
		int pos = 0;
		while(a[hc][pos]!=null)
		{
			pos++;
		}
		a[hc][pos] = obj;
	
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
}
public class GeneralMapTest {

	public static void main(String[] args) {
		
		Mapp p = new Mapp();
		
		Ob o = new Ob("nag","puri");
		Ob o1 = new Ob("nag1","puri1");
		Ob o2 = new Ob("nag2","puri2");
		Ob o3 = new Ob("nag3","puri3");
		
		p.put(o);
		p.put(o1);
		p.put(o2);
		p.put(o3);
		
		
		Ob test = p.get("nag3");
		
		System.out.println("value is...." +test.getValue());
		
		
	}

}
