package com.sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		/*
		 * Student st1=new Student(1001,"Raju",9502475849L);
		 * 
		 * Course c1=new Course(2001,"hibernate","10days"); st1.setCourse(c1);
		 * 
		 * Student st2=new Student(1002,"Ramesh",9502475549L); Course c2=new
		 * Course(2002,"Springboot","20days"); st2.setCourse(c2);
		 * 
		 * Student st3=new Student(1003,"Ramu",9590475549L);
		 * 
		 * session.save(st1); session.save(st2);
		 * 
		 * Transaction transaction = session.beginTransaction(); transaction.commit();
		 */

		//fetch the data
		
		
		//Student s1=(Student)session.get(Student.class, 1001);
//		System.out.println(s1.getStid());
//		System.out.println(s1.getStname());
//		System.out.println(s1.getStcontact());
//		System.out.println(s1.getCourse().getCid());
//		System.out.println(s1.getCourse().getCname());
//		System.out.println(s1.getCourse().getCduration());
		
		
		
		
		//updating 
		Transaction transaction=session.beginTransaction();
//		Student st2 = session.get(Student.class, 1001);
//         if(st2 != null) {
//
//             st2.setStname("vasantha");
//             session.update(st2); 
//         }
		
		
		//deleting 
		
		Student st3=session.get(Student.class, 1002);
		if(st3!=null)
		{
			session.delete(st3);
		}
         transaction.commit();
		session.close();
		factory.close();
		
		
		
		
		
		
		
		
		
		
	}

}
