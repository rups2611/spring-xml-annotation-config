package com.spring;

public class Alien {
    private int age;
    private Laptop laptop;


    public Alien(){
        System.out.println("Alien object created");
    }
    public void code(){
        System.out.println("Coding");
        laptop.compile();
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public int getAge() {
        System.out.println("Getter method called");
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter method called");
        this.age = age;
    }
}
