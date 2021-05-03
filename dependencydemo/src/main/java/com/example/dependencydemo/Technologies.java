package com.example.dependencydemo;

import org.springframework.stereotype.Component;

@Component
public class Technologies {
    private int tech_id;
    private String tech_name;

    public int getTech_id() {
        return tech_id;
    }

    public String getTech_name() {
        return tech_name;
    }

    public void setTech_id(int tech_id) {
        this.tech_id = tech_id;
    }

    public void setTech_name(String tech_name) {
        this.tech_name = tech_name;
    }

    public void display() {
        System.out.println("Tech id: " + this.tech_id + "\t Tech Name: " +
                this.tech_name);
    }
}
