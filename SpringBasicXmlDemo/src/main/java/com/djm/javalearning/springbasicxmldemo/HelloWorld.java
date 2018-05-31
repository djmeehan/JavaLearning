
package com.djm.javalearning.springbasicxmldemo;

public class HelloWorld {

    private String message;
    private AnotherService anotherService;
    private Service service;

    public void setService(Service service) {
        this.service = service;
    }

    public HelloWorld(AnotherService anotherService) {
        this.anotherService = anotherService;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message + " ID: " + id + " using " + service.getName() + " with Setter injection and Another Servoce " + anotherService.getName() + " using construcotr inkectopn");
    }
}

