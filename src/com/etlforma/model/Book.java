package com.etlforma.model;

import java.io.Serializable;
import java.util.List;

public class Book implements Serializable {
	
	private static final long serialVersionUID = 5914324809580837612L;
	
	private String title;
	private Integer numberOfPages;
	private List<Author> authors;
	private String isbn;
	
	public Book(String title, Integer numberOfPages, List<Author> authors, String isbn) {
		this.title = title;
		this.numberOfPages = numberOfPages;
		this.authors = authors;
		this.isbn = isbn;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void addAuthor(Author author) {
		this.authors.add(author);
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
}
