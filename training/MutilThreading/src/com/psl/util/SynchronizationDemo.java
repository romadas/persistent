package com.psl.util;

public class SynchronizationDemo {

	public static void main(String[] args) {
		SharedResource sharedResource;
		sharedResource = new SharedResource(100_000_000_000L);
		new UpdateSharedResource(sharedResource).start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new AccessSharedResources(sharedResource).start();
		
	}

}
