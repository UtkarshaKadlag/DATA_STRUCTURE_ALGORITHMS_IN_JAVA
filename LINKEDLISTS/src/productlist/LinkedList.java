package productlist;
import productlist.Product;
import productlist.Node;

@SuppressWarnings("unused")
public class LinkedList 
{
	private Node head;

	public LinkedList()
	{
		this.head = null;
	}

	public Node getNext() 
	{
		return head;
	}
	
	
	public boolean insert(Product data)
	{
		Node newNode=new Node(data);
		if(newNode==null)
		{
			return false;
		}
		if(head==null)
		{
			head=newNode;
			return true;
		}
		
		Node temp=head;
		
		while(temp.getNext()!=null)
		{
			temp=temp.getNext();
			
		}
		temp.setNext(newNode);
		System.out.println("Product Inserted Successfully!!!");
		return true;
		
	}
	
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.getData()+ " ");
			temp=temp.getNext();
		}
		System.out.println();
		
		
	}
	

}
