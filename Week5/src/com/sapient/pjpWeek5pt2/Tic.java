package com.sapient.pjpWeek5pt2;

public class Tic extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.print("tic-");
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}