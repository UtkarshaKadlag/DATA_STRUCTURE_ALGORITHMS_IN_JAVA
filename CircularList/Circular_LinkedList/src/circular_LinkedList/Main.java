package circular_LinkedList;
import circular_LinkedList.Node;
import circular_LinkedList.CircularLinkedList;

public class Main 
{

	public static void main(String[] args) 
	{
		CircularLinkedList cll=new CircularLinkedList();
		
		cll.insert(10);
		cll.insert(20);
		cll.insert(30);
		cll.insert(50);
		cll.display();
		cll.insertByPosition(40, 4);
		cll.display();
		cll.deleteByVal(10);
		cll.display();
		cll.deleteByVal(50);
		cll.display();
		cll.deleteByVal(30);
		cll.display();
		cll.insertByPosition(10, 1);
		cll.display();
		cll.insert(20);
		cll.insert(30);
		cll.insert(40);
		cll.insert(50);
		cll.display();
		cll.insert(60);
		cll.display();
		cll.deleteByPosition(6);
		cll.display();
		cll.deleteByPosition(1);
		cll.display();
		cll.deleteByPosition(2);
		cll.display();
		
		
		cll.insertByPosition(10, 1);
		cll.display();
		cll.insertByPosition(20, 2);
		cll.insertByPosition(30, 3);
		cll.insert(40);
		cll.insert(50);
		
		cll.display();
	}

}
