package com.psl.Client;

import com.psl.util.MyRunnable;
import com.psl.util.MyThread;

public class ThreadDemo {
	public static void main(String args[]){
		MyThread t1 = new MyThread("First");
		MyThread t2 = new MyThread("second");
		MyThread t3 = new MyThread("third");
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();//called by main on t1,t2,t3 and main thread enters the block stage until t1,t2,t3 completes its execution
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		MyRunnable mr1 = new MyRunnable();
		MyRunnable mr2 = new MyRunnable();
		MyRunnable mr3 = new MyRunnable();
		
		Thread rt1 = new Thread(mr1, "fourth");
		Thread rt2 = new Thread(mr2, "fifth");
		Thread rt3 = new Thread(mr3, "sixth");
		
		rt1.start();
		rt2.start();
		rt3.start();
		
		
		
	}
}
