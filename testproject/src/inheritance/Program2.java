package inheritance;

//C,D and E represents multi-level inheritance
public class Program2 {
	public static void main(String[] args) {
		//object for class D
		D d= new D(10,20.20,30);
		d.display();
		//object for class E
		E e= new E(10,20.22,30,40,'A');
		e.display2();
		
	}

}
