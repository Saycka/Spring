package com.manyatkin.springtest1.entities;

public abstract class Animal {
    protected String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{name = " + name + "}";
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
