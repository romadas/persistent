package com.psl.util;

public class UpdateCommonResource extends Thread{
	private CommanResource commanResource;
	
	public UpdateCommonResource (CommanResource commanResource){
		this.commanResource = commanResource;
	}
	
	@Override
	public void run(){
		try {
			commanResource.getLock();
			for(int x = 0; x < commanResource.getSize();x++){
				commanResource.setNumber(x, commanResource.generateNumber());
			}
			commanResource.releaseLock();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
