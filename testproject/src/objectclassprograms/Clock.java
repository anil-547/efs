package objectclassprograms;

public class Clock {
	int hrs;
	int mins;
	int sec;
	
	public Clock(int hrs,int mins,int sec) {
		this.hrs=hrs;
		this.mins = mins;
		this.sec = sec;
	}
	public String toString() {
		return ("Time is "+this.hrs+"hours "+this.mins+"minutes "+this.sec+"seconds");
	}
	/*public boolean equals(Object o1) {
		return ((this.hrs==o1.hrs)&&(this.mins=o1.mins)&&(this.sec=o1.sec));
	}
*/
}
