package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.PersonDAOImpl;

/**
 * Servlet implementation class UpdatePersonServlet
 */
@WebServlet("/updatePerson")
public class UpdatePersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePersonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		
		Integer age = Integer.parseInt(request.getParameter("age"));
		Integer adh_no = Integer.parseInt(request.getParameter("adh_no"));
		
		PersonDAOImpl pd = new PersonDAOImpl();
		boolean res = pd.updatePerson(age, adh_no);
		
		PrintWriter writer = response.getWriter();
		
		writer.print("<html><body>");
		if(res)
			writer.print("Age Changed");
		else
			writer.print("Could not be changed");
		writer.print("</body></html>");
		
	}

}
