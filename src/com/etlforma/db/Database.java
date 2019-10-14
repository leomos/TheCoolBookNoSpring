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
		this.books = new ArrayList<>();
		this.events = new ArrayList<>();
		
		Author auth1 = new Author("George", "Orwell", new Date(3, 5, 25));
		Author auth2 = new Author("Ken", "Follet", new Date(49, 5, 5));
		Author auth3 = new Author("Stephen", "King", new Date(49, 5, 5));
		
		List<Author> Auth1 = new ArrayList<>();
		List<Author> Auth2 = new ArrayList<>();
		List<Author> Auth3 = new ArrayList<>();
		
		Auth1.add(auth1);
		Auth2.add(auth2);
		Auth3.add(auth3);
		
		Book book1 = new Book("1984", new Integer(237), Auth1, "8804668237");
		Book book2 = new Book("The Pillars of the Earth", new Integer(973), Auth2, "0451207149");
		Book book3 = new Book("IT", new Integer(1116), Auth3, "0450411435");
		
		auth1.addBook(book1);
		auth2.addBook(book2);
		auth3.addBook(book3);

		this.authors.add(auth1);
		this.authors.add(auth2);
		this.authors.add(auth3);
		
		this.books.add(book1);
		this.books.add(book2);
		this.books.add(book3);

		Event event1 = new Event(auth1.getFirstName()+ " " +auth1.getLastName(), book1, new Date(119, 10, 20), "London");
		Event event2 = new Event(auth2.getFirstName()+ " " +auth2.getLastName(), book2, new Date(119, 11, 6), "London");
		Event event3 = new Event(auth3.getFirstName()+ " " +auth3.getLastName(), book3, new Date(119, 12, 8), "London");
		
		this.events.add(event1);
		this.events.add(event2);
		this.events.add(event3);
		this.books.add(new Book("Il piccolo principe", 204,this.authors, "1225425"));
	}

	public List<Author> getAuthors() {
		return this.authors;
	}

	public List<Book> getBooks() {
		return this.books;
	}

	public List<Event> getEvents() {
		return events;
	}

}