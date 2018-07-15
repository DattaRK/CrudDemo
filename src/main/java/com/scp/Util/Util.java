package com.scp.Util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Util {

	private static SessionFactory sessionFactory=null;
	
	public static SessionFactory getSessionfactory() {
		if(sessionFactory==null) {
			sessionFactory=new Configuration().configure().buildSessionFactory();
			return sessionFactory;
		}return sessionFactory;
	}
	
	
	public static void flushNcommit(Session session,Transaction transaction) {
		if( session !=null)
			session.flush();
		if(transaction!=null)
			transaction.commit();
		
	}
	public static void closeSession(Session session) {
		if(session!=null)
			session.close();
	}
	
	/*public static Session getSession() {
		if(sf!=null) {
			ss=sf.openSession();
			return ss;
		}else
			{
			ss=new Configuration().configure().buildSessionFactory().openSession();
			return ss;
			}
	}*/
	
	
}
