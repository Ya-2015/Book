package BookApp;

import java.util.Scanner;

import MyPkg.Book;

public class BookDB {
	
	private Book book;
	public BookDB(String title, String author, String description, double price, boolean isInStock) {
		createBookDB(title, author, description, price,isInStock);
	}
	
	public void createBookDB(String title, String author, String description, double price, boolean isInStock)
	{
		
		
		book = new Book(title, author, description, price,isInStock);
		System.out.println("Book Info");
		System.out.println("\tTitle:\t\t" + book.getTitle());
		System.out.println("\tAuthor:\t\t" + book.getAuthor());
		System.out.println("\tDescription:\t" + book.getDescription() + "\n");
		
	}
	public void getQtyPricing(){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many books you request?\t");
		int num = scan.nextInt();
		System.out.println("\nBook Instock Status: " + book.getIsInStock() + "\tPricing: " + book.pricing(num));
		
		scan.close();
	}
	
}
