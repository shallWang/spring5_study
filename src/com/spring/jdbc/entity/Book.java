package com.spring.jdbc.entity;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

public class Book {
    @Nullable
    private String name;

    private String isbn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "name: " + name + " isbn: "+isbn;
    }
}
