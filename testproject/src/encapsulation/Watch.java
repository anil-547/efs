package encapsulation;

public class Watch {
	private int hour;
	private int minutes;
	private int seconds;

	public Watch(int hour , int minutes , int seconds) {
		this.hour = getHour(hour);
		this.minutes =getMinutes(minutes);
		this.seconds=getSeconds(seconds);		
	}

	public void displayTime() {
		System.out.println("time is :"+hour+":"+minutes+":"+seconds);

	}
	public int getHour(int hour) {
		setHour(hour);
		return hour;
	}
	public int getMinutes(int minutes) {
		setMinutes(minutes);
		return minutes;
	}
	public int getSeconds(int seconds) {
		setSeconds(seconds);
		return seconds;
	}


	public int setHour(int hour) {

		if((hour>=0)&&(hour<=23)) {
			this.hour = hour;
			return hour;
		}
		else {
			System.out.println("false time");
			return 0;
		}

	}


	public int setMinutes(int minutes) {
		if(minutes>=0 && minutes <=59) {
			this.minutes = minutes;
			return minutes;
		}
		else {
			System.out.println("false Time");
			return 0;
		}
	}

	public int setSeconds(int seconds) {
		if(seconds >= 0 && seconds <= 59) {
			this.seconds=seconds;
			return seconds;
		}
		else {
			System.out.println("false time");
			return 0 ;
		}

	}


}
