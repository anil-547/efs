package methods;

public class Method1 {
	int a ;
	public Method1() {
		System.out.println("def const");
	}
	public Method1(int a ) {
		this.a = a;
	}
	
	
	public static int test() {
		System.out.println("static test");
		return 0;
	}
	
	public void  test2() {
		System.out.println("non-static test");
	}

}
