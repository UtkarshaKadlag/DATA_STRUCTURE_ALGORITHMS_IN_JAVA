package linkedlists;

public class SinglyLinkedList 
{
	private Node head;
	public static int counter=0;
	
	public SinglyLinkedList()
	{
		head=null;
		counter=1;
	}
	
	@SuppressWarnings("unused")
	public boolean InsertAtFirstByVal(int data)
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
		
		newNode.setNext(head);
		head.setNext(newNode);
		counter++;
		return true;
	}
	
	@SuppressWarnings("unused")
	public boolean InsertAtLastByVal(int data)
	{
		Node newNode=new Node(data);
		if(newNode==null)
		{
			return false;
		}
		
		Node last=head;
		while(last.getNext()!=null)
		{
			last=last.getNext();
		}
		
		last.setNext(newNode);
		counter++;
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
	}
	
	@SuppressWarnings("unused")
	public boolean InsertByPositionAtFirst(int data,int pos)
	{
		Node newNode=new Node(data);
		if(newNode==null)
		{
			return false;
		}
		
		head=newNode;
		counter++;
		return true;
		
	}
	
	@SuppressWarnings("unused")
	public boolean InsertByPosition(int data,int pos)
	{
		Node newNode=new Node(data);
		if(newNode==null)
		{
			return false;
		}

		Node prev=head;
		for(int i=1;i<pos-1;i++)
		{
			prev=prev.getNext();
		}
		
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		counter++;
		return true;
	}
		
	public boolean deletionByValAtFirst(int data)
	{
		Node temp=head;
		if(temp.getData()==data)
		{
			head=head.getNext();
			return true;
		}
		if(temp.getData()!=data)
		{
			return false;
		}
		counter--;
		return true;
	}
	
	public boolean deleteByVal(int data)
	{
		Node del=head;
		Node prev=head;
		while(del.getData()!=data)
		{
			prev=del;
			del=del.getNext();
			if(del.getNext()==null)
			{
				del=null;
			}
		}
		
		prev.setNext(del.getNext());
		counter--;
		return true;
		
	}
	
	public boolean deleteByPositionAtFirst(int data,int pos)
	{
		Node temp=head;
		if(temp.getData()!=data)
		{
			return false;
		}
		head=head.getNext();
		counter--;
		return true;
	}
	
	public boolean deleteByPosition(int data,int pos)
	{
		Node del=head;
		Node prev=head;
		for(int i=1;i<pos-1;i++)
		{
			prev=prev.getNext();
		}
		
		del=prev.getNext();
		prev.setNext(del.getNext());
		counter--;
		return true;
	}
		
	public static int getNoOfElements()
	{
		System.out.println("Total no of elements in list : ");
		return counter;
	}
	public int getMax()
	{
		Node temp=head;
		int max=temp.getData();
		Node next=head.getNext();
		while(next!=null)
		{
			if(max<next.getData())
			{
				max=next.getData();
			}
			next=next.getNext();
		}
		return max;
	}
	
	public int getMin()
	{
		Node temp=head;
		int min=temp.getData();
		Node next=head.getNext();
		while(next!=null)
		{
			if(min>next.getData())
			{
				min=next.getData();
			}
			next=next.getNext();
		}
		return min;
	}
	
	public boolean searchByval(int key)
	{
		Node temp=head;
		while(temp!=null)
		{
			if(temp.getData()==key)
			{
				return true;
			}
			temp=temp.getNext();
			
		}
		return false;
		
	}
}

