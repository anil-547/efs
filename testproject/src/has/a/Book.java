package has.a;

public class Book {
	int pages;
	public Book(int pages) {
		this.pages=pages;
	}
	public void openBook() {
		System.out.println("book is opened");
	}
	public void turnPage() {
		System.out.println("page is full turn page");
	}
	public void closeBook() {
		System.out.println("book is closed");
	}

}
