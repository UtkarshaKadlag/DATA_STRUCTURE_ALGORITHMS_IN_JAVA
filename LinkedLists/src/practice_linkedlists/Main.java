package practice_linkedlists;
import practice_linkedlists.Node;
import practice_linkedlists.LinkedLists;

public class Main 
{

	public static void main(String[] args) 
	{
		LinkedLists l1=new LinkedLists();
		
		l1.insert(10);
		l1.display();
		System.out.println();
		l1.InsertByPosition(20, 2);
		l1.InsertByPosition(30, 3);
		l1.InsertByPosition(40, 4);
		l1.InsertByPosition(50, 5);
		l1.display();
		
		l1.dispayInReverse();
		
		l1.ReverseList();
		l1.display();
		
		l1.deleteByVal(10);
		l1.display();
		
		l1.ReverseList();
		l1.display();
		
		l1.InsertByPosition(10, 1);
		l1.display();
		
		l1.deleteyByPos(1);
		l1.display();
		l1.deleteyByPos(4);
		l1.display();
		l1.deleteyByPos(2);
		l1.display();
		
		l1.InsertByPosition(10, 1);
		l1.InsertByPosition(30, 3);
		l1.InsertByPosition(50, 5);
		l1.display();
	}

}
