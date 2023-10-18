package org.edu;

public class Desktop implements HaedWare , SoftWare{

	private void deskTopModel() {
		System.out.println("model is aspire 7");

	}

	@Override
	public void softwareResources() {
		System.out.println("software is oxygen ct");
		
	}

	@Override
	public void hardwareResources() {
		System.out.println("cpu, keyboard,monitor");
		
	}
	public static void main(String[] args) {
		Desktop dt = new Desktop();
		
		dt.deskTopModel();
		dt.hardwareResources();
		dt.softwareResources();
	}
}
