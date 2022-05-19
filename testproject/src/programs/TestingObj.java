package programs;

//object casting 
public class TestingObj {
	public static void main(String[] args) {
		System.out.println("before up cating.........\n");
		//object for a
		System.out.println("From A class");
		A a = new A();
		a.t1();
		//object for b
		System.out.println("From B class");
		B b = new B();
		b.t1();
		b.t2();
		//object for c
		System.out.println("From C class");
		C c = new C();
		c.t1();
		c.t2();
		c.t3();
System.out.println("After upcasting........\n");
		
		B rv1 =  new C();
		rv1.t1();
		rv1.t2();
	
		
		A rvv2 = new B();
		rvv2.t1();
		
		A rv3 = new C();
		rv3.t1();


		
		System.out.println("after downcast .........\n");
		C rv2 =(C) rv1;
		rv2.t1();
		rv2.t2();
		rv2.t3();
		
	}
	
	

}
