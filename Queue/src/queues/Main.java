package queues;
import queues.CircularQueue;
import queues.Node;

@SuppressWarnings("unused")
public class Main 
{

	public static void main(String[] args) 
	{
		//Circular Queue//
		CircularQueue cq= new CircularQueue(5);
		
		System.out.println(cq.insert(10));
		System.out.println(cq.insert(20));
		System.out.println(cq.insert(30));
		System.out.println(cq.insert(40));
		System.out.println(cq.insert(50));
		
		System.out.println(cq.delete());
//		System.out.println(cq.insert(60)); //here it will give false as it need one empty memory space in between front and rear to complete cyclic insertion and deletion along with satisfying the isEmpty() and isFull() conditions//
		System.out.println(cq.delete());
		System.out.println(cq.insert(60));
		
		//Simple Queue//
		SimpleQueue sq=new SimpleQueue(5);
		
		System.out.println(sq.insert(10));
		System.out.println(sq.insert(20));
		System.out.println(sq.insert(30));
		System.out.println(sq.insert(40));
		System.out.println(sq.insert(50));
		
		System.out.println(sq.delete());
//		System.out.println(sq.insert(60));
		System.out.println(sq.delete());
		System.out.println(sq.insert(60));
	}

}