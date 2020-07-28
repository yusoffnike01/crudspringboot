package com.example.demo.controller;

import com.example.demo.dao.StudentDao;
import com.example.demo.dao.detailrespontory;
import com.example.demo.dao.studentrespontory;
import com.example.demo.dto.allrequest;
import com.example.demo.dto.studetailresponse;
import com.example.demo.model.detail;
import com.example.demo.model.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private detailrespontory detailres;
    @Autowired
    private StudentDao dao;
    @Autowired
    private studentrespontory studentres;



    @PostMapping("/register")
    public String registerstudent(@RequestBody List<student> obj) {
    dao.saveAll(obj);
        return "Successfull : " + obj.size();
    }

    @PostMapping("/placeorder")
    public student placeorder(@RequestBody allrequest obj) {
     return studentres.save(obj.getStudents());
    }

    @GetMapping("/display")
    public List<student> getStudents() {

        return (List<student>) dao.findAll();


    }

    @GetMapping("/displaydetails")
    public List<detail> getallDetails()
    {

    return detailres.findAll();

    }

    @GetMapping("/displayall")
    public List<student> getalltable()
    {
        return studentres.findAll();
    }

    @PutMapping("/update")
    public String updatestudent(@RequestBody List<student> obj1)
    {
       dao.saveAll(obj1);
       return "Succesfful"+obj1.size();
    }


    @GetMapping("/join")
    public  List<studetailresponse>getjoin()
    {
        return studentres.getjoinstudetail();
    }
    @DeleteMapping("/delete/{id}")
    public String deletestudent(@PathVariable int id)
    {
        Optional<student> obj=dao.findById(id);
        if(obj.isPresent())
        {
            dao.delete(obj.get());
            return "student is deleted with id"+id;
        }
        else
        {
            throw new RuntimeException("student not found or fail");
        }
    }


}
