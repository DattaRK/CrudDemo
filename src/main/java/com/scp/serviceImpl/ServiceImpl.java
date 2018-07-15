package com.scp.serviceImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.scp.Util.Util;
import com.scp.service.Service;
import com.src.entity.Emp;

public class ServiceImpl implements Service{
static SessionFactory sessionFactory=null;
static {
		sessionFactory=Util.getSessionfactory();
	
		}

	@Override
	public boolean addEmp(Emp emp) {
		// List<Emp> list=new ArrayList<>();

		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			session.save(emp);
			Util.flushNcommit(session, transaction);
			return true;
		}

		catch (Exception e) {
			transaction.rollback();
		} finally {
			Util.closeSession(session);
		}
		return false;
	}

	@Override
	public boolean deleteEmp(int eId) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Emp emp = session.get(Emp.class, 10);
			if (emp == null)
				return false;

			session.delete(emp);
			Util.flushNcommit(session, transaction);
			return true;

		}

		catch (Exception e) {
			transaction.rollback();

		} finally {
			// Util.closeSession(session);
		}
		return false;
	}

	@Override
	public boolean updateEmp(Emp emp) {

		return false;
	}

	@Override
	public Emp getEmp(int eId) {
		
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Emp emp = session.get(Emp.class, eId);
			
			// session.delete(emp);
			Util.flushNcommit(session, transaction);
			System.out.println("get emp:" + emp);
			 return emp;

		}

		catch (Exception e) {
			 transaction.rollback();

		} finally {
			Util.closeSession(session);
		}

		return null;
	}

	@Override
	public List<Emp> getAllEmps() {

		Session session = null;
		Transaction transaction=null;
		try {
			session = sessionFactory.openSession();

			transaction = session.beginTransaction();
			List<Emp> listOfEmp = session.createQuery("from Emp").list();

			Util.flushNcommit(session, transaction);
			return listOfEmp;
		} catch (Exception e) {
			transaction.rollback();
		} finally {
				Util.closeSession(session);
		}

		return null;
	}

}