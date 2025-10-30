package com.sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateCreate {
	public static void main(String[] args)
	{
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
	//employee object
	employee e1=new employee("james",50000,1001);
	session.save(e1);
	transaction.commit();
	session.close();
	factory.close();
	
	
	
	
	
	
	
	
	}
}
