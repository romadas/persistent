package com.psl.Client;

public enum FuelType  {
	//passing values to enum
	PETROL(250),DIESEL(14440),NATURAL_GAS(2500);
	private int combustionTemperature;
	
	private FuelType(int combustionTemperature){
		this.combustionTemperature = combustionTemperature;
	}
	public int getCombustionTemperature() {
		return combustionTemperature;
	}

	public void setCombustionTemperature(int combustionTemperature) {
		this.combustionTemperature = combustionTemperature;
	}
	
}
