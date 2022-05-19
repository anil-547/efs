package inheritance;

//This program represents Variable masking with help of class P and Q
public class Program4 {
	
	public static void main(String[] args) {
		Q q = new Q();
		System.out.println(q.a);
		P p = new P();
		System.out.println(p.a);
	}
}
