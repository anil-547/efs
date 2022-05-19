package inheritance;

public class D extends C{
	int c;
	public D(int a , double b, int c) {
		super(a,b);
		this.c=c;
	}
	public void display() {
		System.out.println("from D");
		System.out.println("a:"+this.a+" b:"+this.b+" c:"+this.c);
		
	}

}
