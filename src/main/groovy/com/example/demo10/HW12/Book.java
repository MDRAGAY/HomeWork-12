package com.example.demo10.HW12;

public class Book {
    private final String bookName;
    private  int publishingYear;
    private final Author author;
    public Book(String bookName, Author author, int publishingYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishingYear;
    }
    public String getBookName() {
        return this.bookName;
    }
    public int getPublishingYear() {
        return this.publishingYear;
    }
    public Author getAuthor() {
        return this.author;
    }
    public void setPublishingYear(int publishingYear){
        this.publishingYear = publishingYear;
    }
}