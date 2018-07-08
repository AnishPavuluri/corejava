package com.threads;

public class EvenNumbersThread2 extends Thread {
	Test2 test;
	public EvenNumbersThread2(Test2 t) {
		test = t;
	}

	public void run() {
		
			for(int i=1; i<=10; i++) {
	        	if(i%2==0) {
	        		System.out.println("Even::"+i);
	        		/*test.notify();
	        		try {
						test.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}*/
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
