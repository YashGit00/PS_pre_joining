package com.sapient.pjpWeek5pt2;

public class Runner {
	public static void main(String[] args) {
		Thread t1 = new Tic();
		Thread t2 = new Toc();
		t1.start();
		t2.start();
	}
}
