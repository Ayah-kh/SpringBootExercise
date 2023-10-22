package com.example.Exercise.beans;

public class Book {
    private int id;
    private String bookTitle;
    private String description;

    public Book(int id, String bookTitle, String description) {
        this.id = id;
        this.bookTitle = bookTitle;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
