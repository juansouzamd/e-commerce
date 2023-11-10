package br.com.ecommerce.model;

public class Car {

    private String name;

    public Car(String name) {
        this.name = name;
    }

    public Car(){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
