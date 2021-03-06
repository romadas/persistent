package com.LearnToDrive.Client;

public class PhoneNumber {
	private String area_code;
	private String exchange;
	private String extension;
	public PhoneNumber(){
		
	}
	
	public PhoneNumber(String area_code, String exchange, String extension) {
		super();
		this.area_code = area_code;
		this.exchange = exchange;
		this.extension = extension;
	}
	public boolean equals(Object obj){
		PhoneNumber ph = (PhoneNumber)obj;
		if(this.toString().equals(obj.toString())){
			return true;
		}
		else{
			return false;
		}
	}
	

	@Override
	public String toString() {
		return String.format("(%s)%s-%s", area_code,exchange,extension);
	}



	public String getArea_code() {
		return area_code;
	}
	public void setArea_code(String area_code) {
		this.area_code = area_code;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public static void main(String args[]){
		PhoneNumber ph = new PhoneNumber("800","867","5309");
		PhoneNumber ph1 = new PhoneNumber("400","867","5309");
		System.out.println(ph);
		System.out.println(ph1);
		System.out.println(ph.equals(ph1));
		
		
	}
	
}
