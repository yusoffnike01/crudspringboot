package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student")


public class student {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String matric;
public student()
{

}
    public student(int id, String name, String matric) {
        this.id = id;
        this.name = name;
        this.matric = matric;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatric() {
        return matric;
    }

    public void setMatric(String matric) {
        this.matric = matric;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", matric='" + matric + '\'' +
                '}';
    }
    @OneToMany(targetEntity = detail.class, cascade = CascadeType.ALL)
    @JoinColumn(name="cp_fk", referencedColumnName ="id")
    private List<detail>details;
}
