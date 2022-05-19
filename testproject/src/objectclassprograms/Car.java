package objectclassprograms;

public class Car {
	String brandName;
	int speed;
	double model;
	
	public Car(String brandName, int speed, double model) {
		this.brandName = brandName;
		this.speed =speed;
		this.model = model;
	}
	public String toString() {
		return this.brandName+" model "+this.model+" has top speed "+this.speed;
	}
	

}
