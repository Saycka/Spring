package com.manyatkin.springtest1.entities;

import org.springframework.stereotype.Component;

@Component
public class Parrot extends Animal {

    @Override//("parrot-kesha")
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != getClass()) {
            return false;
        }

        Parrot parrot = (Parrot) o;

        return name.equals(parrot.getName());
    }
}
