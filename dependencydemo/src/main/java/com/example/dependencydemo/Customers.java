package com.example.dependencydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {
    private int customer_id;
    private String customer_name;
    private String course_name;
    @Autowired
    private Technologies technologies;

    public int getCustomer_id() {
        return customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public String getCourse_name() {
        return course_name;
    }

    public Technologies getTechnologies() {
        return technologies;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public void setTechnologies(Technologies technologies) {
        this.technologies = technologies;
    }

    public void display() {
        System.out.println("Customer id: " + this.customer_id + "\t Customer Name: " +
                this.customer_name + "\t Course Name: " + this.course_name);
        technologies.display();
    }
}
