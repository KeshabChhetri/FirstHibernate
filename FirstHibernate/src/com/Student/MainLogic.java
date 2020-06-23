package com.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainLogic {
	public static void main(String args[]) {
		Configuration cf = new Configuration();
		cf.configure("configure.xml");
		SessionFactory sf = cf. buildSessionFactory();
		Session se = sf.openSession();
		
		
		Student x = new Student ();
			
		    
		   
		    x.setId(114);
//		    x.setName("Jaxon");
//		    x.setPhone(9876543222L);
	    
		    
		    
		    Transaction tx = se.beginTransaction();
		  
		    se.delete(x);
		    tx.commit();
		    
		    
		    se.close();
		    sf.close();
		    
			
	}

}
 