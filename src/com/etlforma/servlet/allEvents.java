package com.etlforma.servlet;

import java.util.List;
import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etlforma.db.Database;
import com.etlforma.model.Event;


/**
 * Servlet implementation class allEvents
 */
@WebServlet("/allEvents")
public class allEvents extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private Database db;
    
      @Override
     
       public void init (ServletConfig config) throws ServletException {
    	   super.init(config);
    	   db = new Database();
    	   
       }


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Event> events = db.getEvents();
		
		request.setAttribute("events", events);
		
		request.getRequestDispatcher("/allEvents.jsp").forward(request, response);
}




}
