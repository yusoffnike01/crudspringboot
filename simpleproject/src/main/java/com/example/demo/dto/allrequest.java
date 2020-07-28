package com.example.demo.dto;


import com.example.demo.model.student;

public class allrequest {
    private student students;
    public allrequest() {

    }

    public allrequest(student students) {
        this.students = students;
    }

    public student getStudents() {
        return students;
    }

    public void setStudents(student students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "allrequest{" +
                "students=" + students +
                '}';
    }
}
