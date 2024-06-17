package productlist;

public class Product 
{
	private int productId;
	private String productName;
	private int productQuantity;
	private double price;
	
	public Product(int productId, String productName, int productQuantity, double price) 
	{
		this.productId = productId;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.price = price;
	}

	public int getProductId() 
	{
		return productId;
	}

	public void setProductId(int productId) 
	{
		this.productId = productId;
	}

	public String getProductName() 
	{
		return productName;
	}

	public void setProductName(String productName) 
	{
		this.productName = productName;
	}

	public int getProductQuantity() 
	{
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) 
	{
		this.productQuantity = productQuantity;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productQuantity="
				+ productQuantity + ", price=" + price + "]";
	}
	
	
}
