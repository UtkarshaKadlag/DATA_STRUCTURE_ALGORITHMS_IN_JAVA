package linkedList_operations;
import java.security.DrbgParameters.NextBytes;

import linkedList_operations.Node;

@SuppressWarnings("unused")
public class LinkedList 
{
	private Node head;

	public LinkedList()
	{
		this.head = null;
	}

	public Node getHead() 
	{
		return head;
	}
	
	public boolean insert(int data)
	{
		Node newNode=new Node(data);
		if(newNode==null)
		{
			return false;
		}
		
		//If it is an empty LimkedList add element to 1st node//
		if(head==null)
		{
			head=newNode;
			return true;
		}
		
		//adding element node after last node of LinkedList
		Node temp=head;
		if(head.getData()==data)
			return false;
		while(temp.getNext() !=null)
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
	
	public boolean insert(int data,int pos)
	{
		
		if(pos<=0 || (head==null && pos>1))
		{
			return false;
		}
		
		Node newNode=new Node(data);
		if(newNode==null)
		{
			return false;
		}
		
		
		if(pos==1)
		{
			newNode.setNext(head);
			head=newNode;
			return true;
		}
		
		Node prev=head;
		for(int i=1;i<pos-1;i++)
		{
			prev=prev.getNext();
			//Validation of position 
			if(prev==null)
			{
				return false;
			}
			
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
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
	
	public void maxElement()
	{
		
		Node temp=head;
		int max=head.getData();
		
		
		while(temp!=null)
		{
			
			if(temp.getData() >  max)
			{			
				
				max=temp.getData();
				
			}
			temp=temp.getNext();
		}
		System.out.println("Max Element : "+max);
	}
	
	public void minElement()
	{
		
		Node temp=head;
		int min=head.getData();
		
		
		while(temp!=null)
		{
			
			if(temp.getData() <  min)
			{			
				
				min=temp.getData();
				
			}
			temp=temp.getNext();
		}
		System.out.println("Max Element : "+min);
	}
	
	public void SumOfEvenElements()
	{
		Node temp=head;
		int sum=head.getData();
		int even=0;
		while(temp!=null)
		{
			if(temp.getData()%2==0)
			{
				even+=temp.getData();
			}
			temp=temp.getNext();
		}
		System.out.println("Sum Of Even Elements : "+even);
	}
}
