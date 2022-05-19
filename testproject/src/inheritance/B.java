package inheritance;

public class B extends A{
	int y=20;
	public B(int x ,int y) {
		super(x);
		this.y = y;
	}
	
	public void run() {
		System.out.println("run form b");
	}
	
	
	public void display() {
		System.out.println("display from class B in package inheritance");
		System.out.println(x);
		System.out.println(y);
		this.run();

	}

}
