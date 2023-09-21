package com.gqt.HibernateServlet.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gqt.HibernatServlet.beans.Employee;
import com.gqt.HibernateServlet.model.Model;

public class insertData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empid = Integer.parseInt(request.getParameter("empid"));
		int empsalary = Integer.parseInt(request.getParameter("empsalary"));
		String empname = request.getParameter("empname");
		String empaddress = request.getParameter("empaddress");
		String empcompany = request.getParameter("empcompany");

		Employee e = new Employee();
		e.setEmpid(empid);
		e.setEmpname(empname);
		e.setEmpaddress(empaddress);	
		e.setEmpsalary(empsalary);
		e.setEmpcompany(empcompany);
		

		Model m = new Model();
		boolean b = m.insertData(e);
		if(b==true) {
			response.sendRedirect("/ServletJdbcCrud/InsertSuccess.html");
		}
		else {

			response.sendRedirect("/ServletJdbcCrud/InsertFail.html");
		}
	}

}
