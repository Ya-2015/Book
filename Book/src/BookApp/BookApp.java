package BookApp;

public class BookApp {
	public static void main(String[] args) {
		BookDB bookDb = new BookDB("Pride and Prejudice", "Jane Austen","One of the most universally loved and admired English novels",9.9,true);
	
		bookDb.getQtyPricing();
	}
}
