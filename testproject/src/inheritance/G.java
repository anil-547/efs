package inheritance;

public class G extends F{
	int b;
	public G(int a , int b) {
		super(a);
		this.b=b;
	}
	public void display() {
		System.out.println("from class G");
		System.out.println("a:"+this.a+" b:"+this.b);
	}

}
