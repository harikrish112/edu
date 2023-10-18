package org.edu;

public class Education {

	
	private void ug() {
		System.out.println("this is ug");

	}
	
	private void pg() {
		System.out.println("this is pg");

		
		
	}
	public static void main(String[] args) {
		
		Education ed = new Education();
		Arts arts = new Arts();
		
		
		Engg engg = new Engg();
		Medi med =  new Medi();
		
		ed.pg();
		ed.ug();
		med.dental();
		med.physio();
		med.mBbs();
		engg.bE();
		engg.bTech();
		arts.bA();
		arts.bBa();
		arts.bEd();
		arts.bsc();
		
	}
}
