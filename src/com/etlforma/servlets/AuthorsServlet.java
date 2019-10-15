package com.etlforma.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etlforma.db.Database;
import com.etlforma.model.Author;

public class AuthorsServlet extends HttpServlet {
	private Database db;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
	    super.init(config);
	    db = new Database();
	}
	
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Author> authors = db.getAuthors();
		
		request.setAttribute("authors", authors);
		
		request.getRequestDispatcher("/authors.jsp").forward(request, response);
    }
}
