package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.PersonDAOImpl;
import com.pojo.Person;

/**
 * Servlet implementation class AddPersonServlet
 */
@WebServlet("/addMe")
public class AddPersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddPersonServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		String name = request.getParameter("name");
		Integer age = Integer.parseInt(request.getParameter("age"));
		Integer adh_no = Integer.parseInt(request.getParameter("adh_no"));
		
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		person.setAdh_no(adh_no);
		
		PersonDAOImpl pd  = new PersonDAOImpl();
		int records = pd.addPerson(person);
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		writer.print("<html>"
				+ "<body>");
		
		if(records>0)
		{
			writer.print("RECORD INSERTED!!! Congratulations on becoming a person!!");
		}
		else
		{
			writer.print("SORRY!!! record not inserted1.");
		}
		
		writer.print("</body></html>");
	}

}
