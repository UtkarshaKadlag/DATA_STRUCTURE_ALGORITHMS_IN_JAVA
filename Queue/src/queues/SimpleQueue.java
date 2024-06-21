package queues;

public class SimpleQueue 
{
	private int arr[];
	private int front;
	private int rear;
	private int size;
	
	public SimpleQueue(int size)
	{
		this.size=size;
		arr=new int[size];
		front=rear=-1;
	}
	
	public boolean IsEmpty()
	{
		return (front==-1 &&rear==-1) || (front>rear) ;
	}
	public boolean IsFull()
	{
		return (rear==(size-1)); 
	}
	public boolean insert(int data)
	{
		return true;
	}
	
	public int delete()
	{
		if(IsEmpty())
		{
			return 0;
		}
		
		return arr[front++];
	}
	
}
