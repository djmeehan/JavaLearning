package com.djm.javalearning.springbasicxmldemo;

public class Service {

    public Service() {
        System.out.println("Initialising Service");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;


}
