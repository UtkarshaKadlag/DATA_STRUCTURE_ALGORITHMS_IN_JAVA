package linkedList_operations;

import linkedList_operations.LinkedList;
import linkedList_operations.Node;
@SuppressWarnings("unused")
public class Tester {

	public static void main(String[] args) 
	{

		LinkedList l1=new LinkedList();
		l1.insert(8);
		l1.insert(1);
		l1.insert(2);
		l1.insert(5);
		l1.insert(7);
		l1.insert(4);
		l1.display();
		
		l1.maxElement();
		l1.minElement();
		l1.SumOfEvenElements();

	}

}
