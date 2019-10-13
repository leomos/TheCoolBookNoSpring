package com.etlforma.model;

import java.io.Serializable;
import java.util.Date;

public class Event implements Serializable {
	
	private static final long serialVersionUID = 5914324809580837613L;

	private String name;
	private Book book;
	private Date date;
	private String place;
	
	public Event(String name, Book book, Date date, String place) {
		this.name = name;
		this.book = book;
		this.date = date;
		this.place = place;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
}
