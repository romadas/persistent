package com.psl.util;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int x = 1;x <= 5;x++){
			System.out.println(String.format("%d %s", x,Thread.currentThread().getName()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
