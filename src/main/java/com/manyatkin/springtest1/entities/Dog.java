package com.manyatkin.springtest1.entities;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != getClass()) {
            return false;
        }

        Dog dog = (Dog) o;

        return name.equals(dog.getName());
    }
}
