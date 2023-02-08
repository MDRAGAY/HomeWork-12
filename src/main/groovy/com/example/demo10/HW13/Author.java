package com.example.demo10.HW13;

public class Author {
    private final String name;
    private final String surname;


    public Author (String authorName, String authorSurname) {
        this.name = authorName;
        this.surname = authorSurname;


    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }
    @Override
    public String toString(){
        return name + " " + surname;
    }
}
