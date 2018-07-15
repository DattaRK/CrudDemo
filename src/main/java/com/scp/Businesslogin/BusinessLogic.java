package com.scp.Businesslogin;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.scp.Util.Util;
import com.scp.serviceImpl.ServiceImpl;
import com.src.entity.Emp;

public class BusinessLogic {
	
	public static void main(String[] args) {
		
		ServiceImpl impl=new ServiceImpl();
		
		Emp e1=new Emp(10,"Amol","Amol","fail");
		Emp e2=new Emp(11,"Rahul","Rahul","fail");
		Emp e3=new Emp(12,"Sanket","Sanket","fail");
		
		//System.out.println(list);
		
	boolean isadded = impl.addEmp(e1);
	boolean isadded1= impl.addEmp(e2);
		
		impl.addEmp(e3);
		
		//System.out.println("added employee 10"+isadded);
		//System.out.println("added employee 11"+isadded1);
		
		System.out.println("-----------GET -----------");
		Emp emp=impl.getEmp(11);
		System.out.println("----------GET for ID=11----------"+emp);
		
		System.out.println("-------GET All--------------");
		List<Emp> list1=impl.getAllEmps();
		System.out.println(list1);
		
		
	}
	
	
	
	

}
