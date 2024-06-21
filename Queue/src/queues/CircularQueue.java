package queues;

public class CircularQueue 
{
	private int front;
	private int rear;
	private int size;
	private int[] arr;

	public CircularQueue(int size)
	{
		this.size=size;
		front = -1;
		rear=-1;
		arr=new int[size];
	}

	public boolean isFull()
	{
		return ((rear==-1 && front==(size-1)) || (front==(rear+1)% size));
	}
	
	public boolean isEmpty()
	{
		return front==rear;
	}
	
	public boolean insert(int data)
	{
		if(isFull())
		{
			return false;
		}
		
		rear=(rear+1)%size;
		arr[rear]=data;
		return true;
	}
	
	public int delete()
	{
		if(isEmpty())
		{
			return 0;
		}
		
		front=(front+1)%size;
		return arr[front];
	}
		
}
