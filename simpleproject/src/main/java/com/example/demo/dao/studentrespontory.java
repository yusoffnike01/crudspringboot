package com.example.demo.dao;

import com.example.demo.dto.studetailresponse;
import com.example.demo.model.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface studentrespontory extends JpaRepository<student,Integer> {
    @Query("SELECT new com.example.demo.dto.studetailresponse (A.id,B.email) from student as A INNER JOIN detail as B on A.id=B.id")
    public List<studetailresponse> getjoinstudetail();
}
