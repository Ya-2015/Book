package BookApp;

public class Book {
	
	private String title = "";
	private String author = "";
	private String description = "";
	private double price = 0;
	private boolean isInStock = false;
	
	public Book(String title, String author, String description, double price, boolean isInStock){
		this.title = title;
		this.author = author;
		this.description = description;
		this.price = price;
		this.isInStock = isInStock;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	
	public String getAuthor(){
		return this.author;
	}
	
	public void setDescription(String des){
		this.description = des;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public double getPrice(){
		return this.price;
	}
	
	public void setIsInStock(boolean isInStock){
		this.isInStock = isInStock;
	}
	
	public boolean getIsInStock(){
		return this.isInStock;
	}
	
	public double pricing(double numberOfBooks){
		if (this.isInStock){
			return numberOfBooks * price;
		}else{
			return 0;
		}
		
	}
	
}
