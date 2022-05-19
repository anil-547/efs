package polymorphisam;

//represents run-time polymorphisam
public class RunPoly {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		Rectangle r = new Rectangle();
		r.draw();
		Triangle t = new Triangle();
		t.draw();
	}

}
