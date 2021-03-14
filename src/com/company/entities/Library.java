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

}
