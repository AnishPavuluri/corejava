package com.threads;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		Test2 t = new Test2();
		OddNumbersThread2 oddNumbersThread = new OddNumbersThread2(t);
		
		EvenNumbersThread2 evenNumbersThread = new EvenNumbersThread2(t);
		oddNumbersThread.start();
		Thread.sleep(1);
		evenNumbersThread.start();
		
	}

}
