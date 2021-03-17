package com.company.entities;

import com.company.dao.DAOFactory;

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
        DAOFactory.getInstance().getDaoLibrary().getBooks();
        books.add(book);
        DAOFactory.getInstance().getDaoLibrary().setBooks();
    }
    public void deleteBook(String title) {
        DAOFactory.getInstance().getDaoLibrary().getBooks();
        for (int i = 0; i < books.size(); i++) {
            Book actual = books.get(i);
            if (actual.getTitle().equals(title)) {
                books.remove(actual);
            } else {
                System.out.println("I Dont Have This Book :" + title);
            }
        }
        DAOFactory.getInstance().getDaoLibrary().setBooks();
    }

    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }
}





