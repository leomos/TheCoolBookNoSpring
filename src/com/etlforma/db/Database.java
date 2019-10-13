package com.etlforma.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.etlforma.model.Author;
import com.etlforma.model.Book;
import com.etlforma.model.Event;

public class Database {
	
	private List<Author> authors;
	private List<Book> books;
	private List<Event> events;
	
	public Database() {
		this.authors = new ArrayList<>();
		this.authors.add(new Author("George", "Orwell", new Date(3, 5, 25)));
		this.authors.add(new Author("Ken", "Follet", new Date(49, 5, 5)));
	}
	
	public List<Author> getAuthors() {
		return this.authors;
	}

	public List<Book> getBooks() {
		return books;
	}

	public List<Event> getEvents() {
		return events;
	}
	
}
