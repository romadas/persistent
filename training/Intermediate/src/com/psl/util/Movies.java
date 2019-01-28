package com.psl.util;

import java.util.Date;
import java.util.List;

public class Movies {
	private String name,language,director,producer,duration;
	private Date release_date;
	
	

	public Movies() {
		super();
	}

	public Movies(String name, String language, Date release_date,
			String director, String producer, String duration) {
		super();
		this.name = name;
		this.language = language;
		this.release_date = release_date;
		this.director = director;
		this.producer = producer;
		this.duration = duration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Date getrelease_date() {
		return release_date;
	}

	public void setrelease_date(Date release_date) {
		this.release_date = release_date;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Movies [name=" + name + ", language=" + language
				+ ", release_date=" + release_date + ", director=" + director
				+ ", producer=" + producer + ", duration=" + duration + "]";
	}
	
	
	
	
	
}
