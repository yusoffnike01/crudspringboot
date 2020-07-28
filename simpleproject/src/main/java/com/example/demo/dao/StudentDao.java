package com.example.demo.dao;

import com.example.demo.model.student;

import org.springframework.data.repository.CrudRepository;



public interface StudentDao extends CrudRepository<student,Integer>
{

}