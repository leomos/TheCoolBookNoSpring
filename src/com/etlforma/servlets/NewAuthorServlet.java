package com.etlforma.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etlforma.db.Database;
import com.etlforma.model.Author;

/**
 * Servlet implementation class NewAuthorServlet
 */
//@WebServlet("/NewAuthorServlet")
public class NewAuthorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Database db;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
	    super.init(config);
	    db = new Database();
	}
	
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Author> authors = db.getAuthors();
		Author author=authors.get(Integer.parseInt(request.getParameter("id")));
		request.setAttribute("author", author);
		
		request.getRequestDispatcher("/author.jsp").forward(request, response);
    }


}
