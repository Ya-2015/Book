package MyPkg;

import java.util.Scanner;

public class BookTester {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Book book = new Book("Pride and Prejudice", "Jane Austen", "One of the most universally loved and admired English novels", 9.99, true);
		System.out.println("Book Info");
		System.out.println("\tTitle:\t\t" + book.getTitle());
		System.out.println("\tAuthor:\t\t" + book.getAuthor());
		System.out.println("\tDescription:\t" + book.getDescription() + "\n");
		System.out.print("How many books you request?\t");
		int num = scan.nextInt();
		System.out.println("\nBook Instock Status: " + book.getIsInStock() + "\tPricing: " + book.pricing(num));
		
		scan.close();
	}
}
