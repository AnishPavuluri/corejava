package com.threads;

public class OddNumbersThread extends Thread {
	Test test;
	
	public OddNumbersThread(Test t) {
		test = t;
	}

	public void run() {
		synchronized (test) {
			for(int i=1; i<=10; i++) {
	        	if(i%2!=0) {
	        		System.out.println("Odd::"+i);
	        		try {
	        			test.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	        		test.notify();
	        	}
	        }
			
		}
		
    }
	

}
