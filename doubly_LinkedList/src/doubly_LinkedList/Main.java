package doubly_LinkedList;

public class Main 
{

	public static void main(String[] args) 
	{
		DoublyLinkedList dll=new DoublyLinkedList();
		
		dll.insert(10);
//		dll.display();
		dll.insert(20);
		dll.insert(30);
		dll.insert(40);
		dll.insert(50);
		dll.display();
		dll.insertByPosition(60, 6);
		dll.display();
		
		dll.deleteByVal(10);
		dll.display();
		
		dll.deleteByVal(40);
		dll.display();
//		dll.deleteByPosition(60, 3);
//		dll.deleteByVal(60);
		dll.display();
		dll.deleteByPosition(20, 1);
		dll.display();
		dll.deleteByPosition(50, 2);
		dll.display();
		dll.insert(90);
		dll.insert(120);
		dll.insert(150);
		dll.display();
		dll.deleteByPosition(150, 3);
		dll.display();
		dll.deleteByVal(120);
		dll.display();
		
	}

}
