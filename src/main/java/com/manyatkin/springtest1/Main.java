package com.manyatkin.springtest1;

import com.manyatkin.springtest1.days.WeekDay;
import com.manyatkin.springtest1.entities.Cat;
import com.manyatkin.springtest1.entities.Dog;
import com.manyatkin.springtest1.entities.Parrot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context =
//                new AnnotationConfigApplicationContext("com.manyatkin.springtest1.entities");
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.manyatkin.springtest1.configs");

        Cat cat = context.getBean(Cat.class);
        Dog dog = (Dog) context.getBean("dog");
//        Parrot parrot = context.getBean("parrot-kesha", Parrot.class);

        WeekDay weekDay = context.getBean(WeekDay.class);

        System.out.println(cat.getName());
        System.out.println(dog.getName());
//        System.out.println(parrot.getName());
        System.out.println(weekDay.getNameDay());
    }
}
