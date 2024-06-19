package practice_linkedlists;
import java.util.Stack;

import practice_linkedlists.Node;

@SuppressWarnings("unused")
public class LinkedLists 
{
	private Node head;
	
	public Node getHead() 
	{
		return head;
	}

	public LinkedLists()
	{
		head=null;
	}
	
	//insertion by value
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
		
		Node temp=head;
		while(temp.getNext()!=null)
		{
			temp=temp.getNext();
			if(temp.getData()==data)
			{
				return false;
			}
			
		}
		temp.setNext(newNode);
		return true;
	}
	
	public boolean InsertByPosition(int data,int pos)
	{
		if(head==null || pos<=0)
		{
			return false;
		}
		
		Node newNode=new Node(data);
		if(newNode==null)
		{
			return false;
		}
		//insertion at first position
		if(pos==1)
		{
			newNode.setNext(head);
			head=newNode;
			return true;
		}
		
		//insertion at middle or last position
		Node prev=head;
		for(int i=1;i<pos-1;i++)
		{
			prev=prev.getNext();
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		
		return true;
	}
	
	public void display()
	{
		System.out.println("LinkedList : ");
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println();
	}
	
	public void dispayInReverse()
	{
		System.out.println("LinkedList display in reversed: ");
		Stack<Node> list=new Stack<>();
		
		Node temp=head;
		
		while(temp!=null)
		{
			list.push(temp);
			temp=temp.getNext();
			
		}
		
		while(!list.isEmpty())
		{
			System.out.print(list.pop().getData()+ " ");
		}
		System.out.println();
	}
	
	public void ReverseList()
	{
		
		Node n1=head;
		Node n2=head.getNext();
		
		while(n2!=null)
		{
			Node n3=n2.getNext();
			n2.setNext(n1);
			n1=n2;
			n2=n3;			
		}
		head.setNext(null);
		head=n1;
	}
	
	public boolean deleteByVal(int data)
	{
		if(head.getData()==data)
		{
			head=head.getNext();
			return true;
		}
		
		Node prev=head;
		Node del=head;
		while(del.getData()!=data)
		{
			prev=del;
			del=del.getNext();
			if(del==null)
			{
				return false;
			}
		}
		prev.setNext(del.getNext());
		return true;
	}
	
	public boolean deleteyByPos(int pos)
	{
		if(pos==1)
		{
			head=head.getNext();
			return true;
		}
		
		Node prev=head;
		Node del=head;
		for(int i=1;i<pos-1;i++)
		{
			prev=prev.getNext();
		}
		del=prev.getNext();
		prev.setNext(del.getNext());
		return true;
			
		}
	}

