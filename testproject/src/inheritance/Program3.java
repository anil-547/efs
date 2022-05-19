package inheritance;

//classes F , G and H represents Hierarchical inheritance
public class Program3 {
	
	public static void main(String[] args) {
		//object for G
		G g = new G(1,2);
		g.display();
		//object for H
		H h = new H(2,'b');
		h.display();
	}
}
