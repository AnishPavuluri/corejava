package com.threads;

public class OddNumbersThread2 extends Thread {
	Test2 test;
	
	public OddNumbersThread2(Test2 t) {
		test = t;
	}

	public void run() {
		
			for(int i=1; i<=10; i++) {
	        	if(i%2!=0) {
	        		System.out.println("Odd::"+i);
	        		try {
	        			Thread.sleep(2000l);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	        	}
	        }
			
		
		
    }
	

}
