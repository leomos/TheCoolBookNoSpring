package com.etlforma.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Author implements Serializable {
	
	private static final long serialVersionUID = 5914324809580837611L;
	
	private Integer author_id;
	private String firstName;
	private String lastName;
	private Date birthday;
	private List<Book> books;	
	
	public Author(String firstName, String lastName, Date birthday) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.books = new ArrayList<Book>();

	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Integer getId() {
		return author_id;
	}
	
	public void setId(Integer id) {
		this.author_id = id;
	}
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Date getBirthday() {
		return birthday;
	}
	
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void addBook(Book book) {
		
		this.books.add(book);
	}

}
