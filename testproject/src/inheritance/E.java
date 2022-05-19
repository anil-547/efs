package inheritance;

public class E extends D {
	int d;
	char e;
	
	public E(int a , double b, int c, int d, char e) {
		super(a,b,c);
		this.d=d;
		this.e=e;
	}
	public void display2() {
		System.out.println("from E");
		System.out.println("a:"+this.a+" b:"+this.b+" c:"+this.c+" d:"+this.d+" e:"+this.e);
	}

}
