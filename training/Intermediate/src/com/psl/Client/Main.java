package com.psl.Client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.psl.util.DurationComaparator;
import com.psl.util.LanguageAndReleaseComparator;
import com.psl.util.LanguageComparator;
import com.psl.util.Movies;

public class Main {
	public static void main(String args[]) throws ParseException{
		
		Main m1 = new Main();
		List<Movies> listm = m1.createMovieList();
		Iterator itr = listm.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next()+" ");
		}
		System.out.println("----------------sort by language----------------------");
		m1.sortByLanguage(listm);
		System.out.println("-----------------sort by language and relaese---------------------");
		m1.sortByLanguageAndReleaseDate(listm);
		System.out.println("---------------sort by time-----------------------");
		m1.sortByDuration(listm);
	}

	
	

	public List<Movies> createMovieList() throws ParseException {
		List<Movies> listm = new ArrayList<Movies>();
		
		Movies m=new Movies();
		m.setName("my name is khan");
		m.setLanguage("hindi");
		m.setrelease_date(utilDate("08/10/2010"));
		m.setProducer("karan johar");
		m.setDuration("2:30");
		m.setDirector("abc");
		listm.add(m);
		
		Movies n=new Movies();
		n.setName("Zindagi na milegi dobara");
		n.setLanguage("hindi");
		n.setrelease_date(utilDate("10/10/2010"));
		n.setProducer("zoya aktar");
		n.setDuration("3:30");
		n.setDirector("mangesh");
		listm.add(n);

		Movies o=new Movies();
		o.setName("documetry on persistent");
		o.setLanguage("english");
		o.setrelease_date(utilDate("10/10/2000"));
		o.setProducer("sejal");
		o.setDuration("0:10");
		o.setDirector("aman");
		listm.add(o);
		return listm;
	}
	
	private Date utilDate(String string) throws ParseException {
		return new SimpleDateFormat("dd/M/yyyy").parse(string);
	}

	public void sortByLanguage(List<Movies> list){
		LanguageComparator lcom = new LanguageComparator();
		Collections.sort(list,lcom);
		for(Movies m : list){
			System.out.println(m);
		}
	}
	public void sortByLanguageAndReleaseDate(List<Movies> listm){
		LanguageAndReleaseComparator lrc = new LanguageAndReleaseComparator();
		Collections.sort(listm,lrc);
		for(Movies m : listm){
			System.out.println(m);
		}
	}
	private void sortByDuration(List<Movies> listm) {
		DurationComaparator dc = new DurationComaparator();
		Collections.sort(listm,dc);
		for(Movies m : listm){
			System.out.println(m);
		}
	}
}
