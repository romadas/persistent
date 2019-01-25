package com.psl.util;

public class AccessCommonResource extends Thread{
private CommanResource commanResource;
	
	public AccessCommonResource(CommanResource commanResource){
		this.commanResource = commanResource;
	}
	
	@Override
	public void run(){
		try {
			commanResource.getLock();
			for(int x = 0;x < commanResource.getSize();x++){
				System.out.println(commanResource.getNumber(x));
				
			commanResource.releaseLock();
			} 
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
}
