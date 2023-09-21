package com.gqt.HibernatServlet.beans;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServlet;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateManager {
	public Session session;
	public HibernateManager() {
		// TODO Auto-generated constructor stub
		Configuration configuration = 
				new Configuration().configure("Hibernate.cfg.xml"); //connects to cfg
		ServiceRegistryBuilder builder = 
				new ServiceRegistryBuilder().applySettings
				(configuration.getProperties());
		SessionFactory sessionFactory = 
				configuration.buildSessionFactory
				(builder.buildServiceRegistry());       		   
		session =sessionFactory.openSession();	
		System.out.println("Connected to DB....");
	}
//	void insertData(Employee e) {
//		Transaction transaction = session.beginTransaction();
//		session.save(e);
//		System.out.println("Data is Storage");
//		transaction.commit();
//
//	}
//	void selectData(Employee e) {
//	    Transaction transaction = session.beginTransaction();
//	    Employee employee = (Employee) session.get(Employee.class, e.getEmpid());
//	    System.out.println(employee);
//	    transaction.commit();
//	}
//	
	void fetchAllData() {
		Transaction beginTransaction = session.beginTransaction();
		Query q = session.createQuery("FROM Employee");
		List l = q.list();
		Iterator iterator = l.iterator();
		
	while(iterator.hasNext()) {
		Employee e = (Employee) iterator.next();
		System.out.println("The details of the Employee are:");
		System.out.println("ID: "+e.getEmpid());
		System.out.println("Name: "+ e.getEmpname());
		System.out.println("Company: " + e.getEmpcompany());
		System.out.println("Salary: "+ e.getEmpsalary());
		System.out.println("Address: "+ e.getEmpaddress());
		}
	}
//	void updateData(int empId, String empNewName) {
//		Transaction transaction = session.beginTransaction();
//		Employee e = (Employee) session.get(Employee.class, empId);
//		e.setEmpname(empNewName);
//		session.update(e);
//		transaction.commit();
//		System.out.println("Data updated");
//	}
//	void deleteData(int empId) {
//		Transaction transaction = session.beginTransaction();
//		Employee e = (Employee) session.get(Employee.class, empId);
//		session.delete(e);
//		transaction.commit();
//		System.out.println("Data deleted");
//	}
//	
//	
}
