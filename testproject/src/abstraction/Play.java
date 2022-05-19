package abstraction;

public class Play {

	public static Tv getProgram() {
		Tv t1 = new Programs();
		return t1;

	}
	public Tv fetchProgram() {
		Tv t2= new Programs();
		return t2;
	}
}
