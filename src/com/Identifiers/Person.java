package com.Identifiers;

public class Person {
    private String name;
    private boolean blond;

    public boolean isBlond() {//для булиан можно использовать конструкцию is
        return blond;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
