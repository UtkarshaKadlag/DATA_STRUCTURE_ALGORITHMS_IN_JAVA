package doubly_LinkedList;

public class DoublyLinkedList 
{
	private Node head;
	
	public DoublyLinkedList()
	{
		this.head=null;
	}
	
	public boolean insert(int data)
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
		
		Node last=head;
		while(last.getNext()!=null)
		{
			last=last.getNext();
		}
		last.setNext(newNode);
		newNode.setPrev(last);
		return true;
	}
	public boolean insertByPosition(int data,int pos)
	{
		Node newNode=new Node(data);
		if(newNode==null)
		{
			return false;
		}
		
		if(pos==1)
		{
			if(head==null)
			{
				head=newNode;
				return true;
			}
			
			newNode .setNext(head);
			head.setPrev(newNode);
			return true;
		}
		
		Node prev=head;
		for(int i=1;i<pos-1;i++)
		{
			prev=prev.getNext();
		}
		
		Node next=prev.getNext();
		if(next!=null)
		{
			newNode.setNext(next);
			newNode.setPrev(prev);
		}
		
		prev.setNext(newNode);
		
		return true;
	}
	
	public boolean deleteByVal(int data)
	{
		if(head.getData()==data)
		{
			if(head.getNext()==null)
			{
				head=null;
				return true;
			}
			
			head=head.getNext();
			return true;
		}
		
		Node del=head;
		while(del.getData()!=data)
		{
			del=del.getNext();
			if(del==null)
			{
				return false;
			}
		}
		
		Node prev=del.getPrev();
		Node next=del.getNext();
		
		prev.setNext(next);
		if(next!=null)
			next.setPrev(prev);
		return true;
	}
	
	public boolean deleteByPosition(int data,int pos)
	{
		if(pos==1)
		{
			if(head.getNext()==null)
			{
				head=null;
				return true;
			}
			
			head=head.getNext();
			return true;
		}
		
		Node del=head;
		for(int i=1;i<pos;i++)
		{
			del=del.getNext();
		}
		
		Node prev=del.getPrev();
		Node next=del.getNext();
		
		prev.setNext(next);
		if(next!=null)
			next.setPrev(prev);
		
		return true;
	}
	
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println();
	}
}
