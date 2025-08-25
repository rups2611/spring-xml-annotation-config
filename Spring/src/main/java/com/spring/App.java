package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App{
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien a1 =(Alien) context.getBean("aln");
        Alien a2= (Alien) context.getBean("aln");
        System.out.println(a1==a2);
        Laptop obj1 = (Laptop) context.getBean("lap");
        Laptop obj2 = (Laptop) context.getBean("lap");
        System.out.println(obj1==obj2);
        a1.code();
        obj1.compile();
        a1.setAge(27);
        System.out.println(a1.getAge());

        a1.code();

    }
}




















