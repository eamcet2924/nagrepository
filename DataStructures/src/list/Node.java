package list;

public class Node {
	
	private String data;
	private Node next;
	private Node root,root1 = null;
	private Node temp;
	
	Node()
	{
		
	}
	Node(String data)
	{
		this.data = data;
		this.next = null;
	}
	
	void createnode(String data)
	{
		if(root == null)
		{
			root = new Node(data);
			root1 = root;
					
		}else
		{
			temp = new Node(data);
			root1.next = temp;
			root1 = root1.next;
			
		}
	}
	
	void display()
	{
		while(root!=null)
		{
			System.out.println("data is " +root.data);
			root = root.next;
		}
	}

}
