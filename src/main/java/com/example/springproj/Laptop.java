package com.example.springproj;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
    private int lid;
    private String brand;

    public Laptop() {
        System.out.println("Creating Laptop Object");
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void compile() {
        System.out.println("Compiling...");
    }
}
