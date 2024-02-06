package com.ict.day17;

public class Ex06_Producer implements Runnable {
	private Ex06_Car car; // Ex06_Car car = null; 과 유사하다.
	public Ex06_Producer(Ex06_Car car) {
		this.car = car;
	}
	
	@Override
	public void run() {
		String carName=null;
		for (int i = 0; i < 30; i++) {
			carName = car.getCar();
			car.push(carName);
			try {
				Thread.sleep((int)(Math.random()*500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
