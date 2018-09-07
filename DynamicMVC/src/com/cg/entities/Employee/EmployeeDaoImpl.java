package com.cg.entities.Employee;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.dto.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao
{
	@PersistenceContext
	EntityManager em;
	
	@Override
	public int insertEmployee(Employee emp)
	{
		em.persist(emp);
		return emp.getEmpno();
	}
}
