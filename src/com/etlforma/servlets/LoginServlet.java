package com.etlforma.servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etlforma.db.Database;
import com.etlforma.model.User;

public class LoginServlet extends HttpServlet {
	
	private Database db;

	@Override
	public void init(ServletConfig config) throws ServletException {
	    super.init(config);
	    db = new Database();
	}
	
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/loginForm.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Map<String, String> messages = new HashMap<String, String>();

        if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
            messages.put("validation", "Username and password must be provided.");
        } else {
            Optional<User> user = db.findUser(username, password);

            if (user.isPresent()) {
                request.getSession(true).setAttribute("username", user.get());
                response.sendRedirect(request.getContextPath());
                return;
            } else {
                messages.put("login", "Unknown login, please try again");
            }
        }

        request.setAttribute("messages", messages);
        request.getRequestDispatcher("/loginForm.jsp").forward(request, response);
    }

}
