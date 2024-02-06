package com.ict.day17;

public class Ex07_ATM implements Runnable {
	private long depositeMoney = 10000;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				if (getDepositeMoney() <= 0)
					break;
				withDraw(1000);
				if (getDepositeMoney() == 2000 || 
					getDepositeMoney() == 4000 || 
					getDepositeMoney() == 6000 || 
					getDepositeMoney() == 8000) {

					try {
						this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					this.notify();
				}
			}
		}
	}

	public long getDepositeMoney() {
		return depositeMoney;
	}

	public void withDraw(long howMuch) {
		if (getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName() + " , ");
			System.out.println("잔액 : " + getDepositeMoney());
		} else {
			System.out.print(Thread.currentThread().getName() + " , ");
			System.out.println("잔액이 부족합니다.");
		}
	}
}
