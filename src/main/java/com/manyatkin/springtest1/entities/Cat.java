package com.manyatkin.springtest1.entities;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {

    public Cat() {
        name ="Kitty";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != getClass()) {
            return false;
        }

        Cat cat = (Cat) o;

        return name.equals(cat.getName());
    }
}
