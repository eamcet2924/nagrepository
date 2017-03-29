package com.stack;

//import com.list.Node;

//import com.list.Node;

class Node
{
	private String data;
	private Node next;
	private Node prev;
	
	Node root,root1,temp,temp1,endroot=null;
	
	Node rev1,rev2,rev3=null;
	
	Node()
	{
		
	}
	Node(String data,Node next,Node prev)
	{
		this.data=data;
		this.next=next;
		this.prev=prev;
	}
	
	void createNode(String data)
	{
		if(root == null)
		{
			root = new Node(data,null,null);
			root1 = root;
		}else
		{
			temp = new Node(data,null,null);
			root1.next = temp;
			temp.prev= root1;
			root1 = root1.next;
			endroot = temp;
			
		}
	}
	
	void display()
	{
		//System.out.println("Nag...");
		Node temp1 = root;
		while(temp1!=null)
		{
			System.out.println(temp1.data);
			temp1 = temp1.next;
		}
	}
	
	/*void revdisplay()
	{
		//System.out.println("Nag...");
		Node temp1 = endroot;
		while(temp1!=null)
		{
			System.out.println(temp1.data);
			temp1 = temp1.prev;
		}
	}
	 21 63+
	 w/
	 */
	void pop()
	{
		//System.out.println("Nag...");
		endroot = endroot.prev;
		endroot.next = null;
		//endroot.prev = null;
		if(endroot.prev == null)
		{
			System.out.println("Null came can't popup again....");
		}
	}
	void reverse()
	{
		
		while(root!=null)
		{
			rev1 = root.next;
			root.next=rev2;
			rev2 = root;
			root = rev1;
			
		}
		
		root = rev2;
	}
}

public class LinkedStackTest {

	public static void main(String[] args) {

		Node n = new Node();

		n.createNode("nagg1");
		n.createNode("nagg2");
		n.createNode("nagg3");
		n.createNode("nagg4");
		n.createNode("nagg5");
		n.pop();
		n.pop();
		n.pop();
		n.pop();
		n.createNode("nagg6");
		//n.revdisplay();

	}

}
