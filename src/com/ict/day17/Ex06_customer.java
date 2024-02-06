package com.ict.day17;

public class Ex06_customer implements Runnable {
	private Ex06_Car car;
	
	public Ex06_customer(Ex06_Car car) {
		this.car = car;
	}
	@Override
	public void run() {
		String carName = null;
		for (int i = 0; i < 30; i++) {
			carName = car.pop();
			try {
				Thread.sleep((int)(Math.random()*200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
