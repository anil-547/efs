package objectclassprograms;

public class ClockTower {
	Clock ck;
	String loc;
	int hight;
	public ClockTower(Clock ck ,String loc ,int hight) {
		this.ck=ck;
		this.loc= loc;
		this.hight=hight;
		
	}
	public String toString() {
		return (this.loc+" "+this.ck);
	}

}
