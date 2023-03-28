package com.techsoldev.tictactoegame;

public class Demo {

    int a,b;
    String name , address;

    public Demo(int a, int b, String name, String address) {
        this.a = a;
        this.b = b;
        this.name = name;
        this.address = address;
    }

    public Demo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
