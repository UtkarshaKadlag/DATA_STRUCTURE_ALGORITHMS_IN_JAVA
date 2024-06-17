package productlist;
import productlist.Node;
import productlist.Product;
import productlist.LinkedList;

@SuppressWarnings("unused")
public class Main 
{

	public static void main(String[] args) 
	{
		LinkedList l1=new LinkedList();
		
		Product p1=new Product(101,"Lays",5,10.00);
		Product p2=new Product(102,"Cookies",3,50.00);
		Product p3=new Product(103,"Cake",2,500.00);
		Product p4=new Product(104,"Munchies",10,5.00);
		Product p5=new Product(105,"Chocolates",100,1.00);
		
		l1.insert(p1);
		
		l1.insert(p2);
		
		l1.insert(p3);
		
		l1.insert(p4);
//		l1.display();
		l1.insert(p5);
		
		l1.display();
	}

}
