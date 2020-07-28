package com.example.demo.dto;


public class studetailresponse {
    private int id;
    private String email;

    public studetailresponse() {
    }

    public studetailresponse(int id, String email) {
        this.id = id;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "studetailresponse{" +
                "id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
}

