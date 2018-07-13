package com.linhdt.demo.demo.model;

/**
 * Created by linhdt on 13/07/2018.
 */
public class Users {
    private String name;
    private String salary;
    private Integer id;


    public Users(Integer id, String name, String salary ) {

        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Users() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
