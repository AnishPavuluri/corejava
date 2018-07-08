package com.threads;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		Test t = new Test();
		OddNumbersThread oddNumbersThread = new OddNumbersThread(t);
		
		EvenNumbersThread evenNumbersThread = new EvenNumbersThread(t);
		oddNumbersThread.start();
		//Thread.sleep(1);
		evenNumbersThread.start();
		
	}

}
