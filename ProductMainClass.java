package com.nit.encapSulationProgram;

public class ProductMainClass 
{

	public static void main(String[] args) 
	{
		Product P = new Product("12334","Laptop",60000,5.3);
		P.applyDiscount();
		P.displayProductInfo();
		P.setDiscount(5.3);
	}

}
class Product
{
	private String ProductId;
	private String Name;
	private double Price;
	private double Discount;
	public Product(String ProductId,String Name,double Price,double Discount)
	{
		this.ProductId = ProductId;
		this.Name = Name;
		setPrice(Price);
		setDiscount(Discount);
	}
	public String getProductId() 
	{
		return ProductId;
	}
	public void setProductId(String productId) 
	{
		this.ProductId = productId;
	}
	public String getName() 
	{
		return Name;
	}
	public void setName(String name) 
	{
		this.Name = name;
	}
	public double getPrice() 
	{
		return Price;
	}
	public void setPrice(double price) 
	{
		this.Price = price;
	}
	public double getDiscount() 
	{
		return Discount;
	}
	public void setDiscount(double discount) 
	{
      if (discount >= 0 && discount <= 100) 
      {
        this.Discount = discount;
        
      } 
      else 
      {
            System.out.println("Invalid discount! Setting discount to 0.");
            this.Discount = 0;
      }
   }
	 public void applyDiscount() 
	 {
	   double discountAmount = Price * (Discount / 100);
	   Price -= discountAmount;
	   System.out.println("Discount of " + Discount + "% applied. New price: " + Price);
	    
	}
	 public void displayProductInfo() 
	 {      
		    System.out.println("================================");
	        System.out.println("Product ID   : " + ProductId);
	        System.out.println("Product Name : " + Name);
	        System.out.println("Price        : " + Price);
	        System.out.println("Discount (%) : " + Discount);
		    System.out.println("================================");

	 }
}