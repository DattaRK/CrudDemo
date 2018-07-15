package com.scp.service;

import java.util.List;

import com.src.entity.Emp;

public interface Service {
	public boolean addEmp(Emp emp);
	public boolean deleteEmp(int eId);
	public boolean updateEmp(Emp emp);
	public Emp getEmp(int eId);
	public List<Emp> getAllEmps();	

}


