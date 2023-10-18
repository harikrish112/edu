package org.edu;

public interface Bike {

	double cost();
	
	int speed();
	
	public static void main(String[] args) {
		Ktm ktm = new Ktm();
		
		double cost = ktm.cost();
		int speed = ktm.speed();
		
	
		System.out.println("ktm bike cost is $ "+cost);
		System.out.println("ktm bike speed is : "+speed);
	}
}
