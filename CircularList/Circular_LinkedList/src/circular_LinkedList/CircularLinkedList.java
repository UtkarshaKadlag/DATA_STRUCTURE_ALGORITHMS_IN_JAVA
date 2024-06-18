package circular_LinkedList;

import circular_LinkedList.Node;

public class CircularLinkedList 
{
	private Node head;
	
	public CircularLinkedList()
	{
		head=null;
	}
	
	public boolean insert(int data)
	{
		Node newNode =new Node(data);
		if(newNode==null)
		{
			return false;
		}
		
		if(head==null)
		{
			head=newNode;
			newNode.setNext(head);
			return true;
		}
		
		Node last=head;
		while(last.getNext()!=head)
		{
			last=last.getNext();
		}
		last.setNext(newNode);
		newNode.setNext(head);
		
		return true;
	}
	
	public boolean insertByPosition(int data,int pos)
	{
		Node newNode=new Node(data);
		if(newNode==null)
		{
			return false;
		}
		
		if(head==null && pos<=0)
		{
			return false;
		}
		
		if(pos==1)
		{
			head=newNode;
			newNode.setNext(head);
			return true;
		}
		
		Node prevNode=head;
		for(int i=1;i<pos-1;i++)
		{
			prevNode=prevNode.getNext();
			if(prevNode==head)
			{
				return false;
			}
		}
		newNode.setNext(prevNode.getNext());
		prevNode.setNext(newNode);
		return true;
		
	}
	
	public void display()
	{
		Node temp=head;
		if(head==null)
		{
			return;
		}
		do 
		{
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}while(temp!=head);
		System.out.println();	
	}
	
	public boolean deleteByVal(int data)
	{
		if(head.getData()==data)
		{
			if(head.getNext()==head)
			{
				head=null;
				return true;
			}
			Node last=head;
			while(last.getNext()!=head)
			{
				last=last.getNext();
			}
			head=head.getNext();
			last.setNext(head);
			return true;
			
		}
		Node prev=head;
		Node del=head;
		while(del.getData()!=data)
		{
			prev=del;
			del=del.getNext();
			if(del==head)
			{
				return false;
			}
		}
		prev.setNext(del.getNext());
		return true;		
	}
	
	public boolean deleteByPosition(int pos)
	{
		if(pos==1)
		{
			if(head.getNext()==head)
			{
				head=null;
				return true;
			}
			
			Node last=head;
			while(last.getNext()!=head)
			{
				last=last.getNext();
			}
			head=head.getNext();
			last.setNext(head);
			return true;
		}
		
		Node prevNode=head;
		
		for(int i=1;i<pos-1;i++)
		{
			prevNode=prevNode.getNext();
			if(prevNode.getNext()==head)
			{
				return false;
			}
		}
		
		Node del=prevNode.getNext();
		prevNode.setNext(del.getNext());
		return true;
	}
}
