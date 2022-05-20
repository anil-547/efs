package has.a;

public class Author {
	String author;
	String articalName;
	Book b;
	Pen p;
	
	public Author(String author, String articalName, Book b , Pen p) {
		this.author = author;
		this.articalName = articalName;
		this.b = b;
		this.p = p;
	}
	public void writeArtical() {
		b.openBook();
		p.write();
		b.turnPage();
		p.write();
		b.closeBook();
	}

}
