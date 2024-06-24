package linkedlists;
import java.util.Scanner;
import static linkedlists.SinglyLinkedList.getNoOfElements;

import linkedlists.SinglyLinkedList;
@SuppressWarnings("unused")
public class Main 
{

	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			SinglyLinkedList sll= new SinglyLinkedList();
		
			boolean exit=false;
			while(!exit)
			{
				System.out.println("MAIN MENU : ");
				System.out.println("1.Insert by value at first  \n2.Insert by value at last \n3.Insert by position at first  \n4.Insert by position at last or in-middle  \n5.Deletion by value at first \n6.Deletion by value at last or in-middle \n7.deletion by position at first \n8.deletion by position at last or in-middle \n9.Total no of elements in List \n10.Get maximum element \n11.Get minimum element \n12.Search element in LinkedList \n13.Display");
				System.out.println("Enter your Choice : ");

				try
				{
					switch(sc.nextInt())
					{
						case 1: System.out.println("Enter the value to add in Linked List : ");
								sll.InsertAtFirstByVal(sc.nextInt());
								break;
				 		
						case 2: System.out.println("Enter the value to add last in linked list : ");
					 			sll.InsertAtLastByVal(sc.nextInt());
					 			break;
					 		
					 	case 3: System.out.println("Enter the value you want to add at position 1 : ");
								sll.InsertByPositionAtFirst(sc.nextInt(), 1);
								break;
							
					 	case 4: System.out.println("Enter the value and position you want to enter the data at : ");
					 			sll.InsertByPosition(sc.nextInt(), sc.nextInt());
					 			break;
					 		
					 	case 5: System.out.println("Enter the first value to delete at first by val : ");
								sll.deletionByValAtFirst(sc.nextInt());
								break;
							
					 	case 6: System.out.println("Enter the value of the last element to delete at last by value : ");
					 			sll.deleteByVal(sc.nextInt());
					 			break;
					 			
					 	case 7: System.out.println("Enter the value of first element to delete : ");
					 	 		sll.deleteByPositionAtFirst(sc.nextInt(), 1);
					 	 		break;
					 	 		
					 	case 8: System.out.println("Enter the value of last element and it's position to delete : ");
					 			sll.deleteByPosition(sc.nextInt(), sc.nextInt());
					 			break;
					 			
					 	case 9: System.out.println(sll.getNoOfElements());
					 			break;
					 		
					 	case 10: System.out.println("The maximum element of LinkedList : ");
					 	 		 System.out.println(sll.getMax());
					 	 		 break;
					 	 		 
					 	case 11: System.out.println("The Minimum element of LinkedList : ");
					 	 		 System.out.println(sll.getMin());
					 	 		 break;
					 	 		 
					 	case 12 : System.out.println("Enter the key to search : ");
					 	 		  System.out.println(sll.searchByval(sc.nextInt()));
					 	 		  break;
					 	 		 
					 	case 13: sll.display();
					 			System.out.println();
								break;
				}
		
			}
			catch(Exception e)
			{
				sc.nextLine();
				e.printStackTrace();
			}
		}
	}
}
}