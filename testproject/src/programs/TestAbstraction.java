package programs;

import abstraction.Tv;
import abstraction.Play;

public class TestAbstraction {
	public static void main(String[] args) {
		Tv t = Play.getProgram();
		t.playProgram();

		Play p = new Play();
		Tv t2 =p.fetchProgram();
		t2.playProgram();


	}

}
