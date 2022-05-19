package programs;

//this keyword example
public class Thisexample {
	int empid;
	String name;
	int phno;
	Thisexample(int empid, String name , int phno) {
		this.empid=empid;
		this.name = name;
		this.phno = phno;
	}
	public void display() {
		System.out.println("Employee id "+empid+" and his name "+name+" and his mobile number "+phno);
	}

	public static void main(String[] args) {
		Thisexample rf = new Thisexample(1234,"anil",1234567890);
		rf.display();
	}
}
