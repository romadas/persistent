package com.psl.Client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CityStateMap {
	Map<String,List<String>> map;
	
	public CityStateMap(){
		map = new HashMap<String, List<String>>();
	}
	
	public void addCityState(String state,String city){
		//List<String> cities = map.getOrDefault(state, new ArrayList<String>());
		List<String> cities = map.get(state);
		if(cities==null)
			cities = new ArrayList<String>();
		cities.add(city);	
		map.put(state, cities);
		
	}
	
	public List<String> getAllCity(){
		List<String> allcities = new ArrayList<String>();
		for(String state : map.keySet()){
			//list of cities
			allcities.addAll(map.get(state));
		}
		
		return allcities;
		
	}
	
	public List<String> getAllState(){
		List<String> allstate = new ArrayList<String>();
		allstate.addAll(map.keySet());
		return allstate;
		
	}
	
	public List<String> getCities(String state){
		
		return map.get(state);
		
	}
	public void deleteCities(String state){
		map.remove(state);
	}
	public String getState(String city){
		for(String state : map.keySet()){
			if(map.get(state).contains(city)){
				return state;
			}
			
		}
		return null;
		
	}

	@Override
	public String toString() {
		return "CityStateMap [map=" + map + "]";
	}
	
	
	
}
