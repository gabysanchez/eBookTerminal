package com.company.entities;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private static Library bibliteca;
    private List<Book> books;

    private Library(){
        this.books = new ArrayList<>();
    }

    public static Library getInstance() {
        if(bibliteca == null){
            bibliteca = new Library();
        }
        return bibliteca;
    }
    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            Book actual = books.get(i);
            if (actual.getTitle().equals(title)) {
                books.remove(actual);
            } else {
                System.out.println("I Dont Have This Book :" + title);
            }

        }
    }
}





