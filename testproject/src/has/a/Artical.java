package has.a;

public class Artical {
	
	public static void main(String[] args) {

		Author a=new Author("anil","java",new Book(10),new Pen("blue"));
		a.writeArtical();
	}
}
