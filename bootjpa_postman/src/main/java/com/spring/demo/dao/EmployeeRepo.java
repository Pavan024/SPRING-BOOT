package com.spring.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.demo.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee , Integer>
{
//	List<Employee> findByEid(int eid);
//	List<Employee> findByEidGreaterThan(int eid);
//	
//	@Query("from Employee where eid=?1 order by ename")
//	List<Employee> findByEidSorted(int eid);
}
