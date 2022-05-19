package inheritance;

public class H extends F{
	char c;
	
	public H(int a ,char c) {
		super(a);
		this.c =c;
	}
	public void display() {
		System.out.println("from class H");
		System.out.println("a:"+this.a+" c:"+this.c);
	}

}
