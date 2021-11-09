package com.spring.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.demo.model.Student;

public interface StudentRepo extends CrudRepository<Student, Integer>
{

}
