package com.company.entities;

import java.util.ArrayList;
import java.util.List;

public class Cataloge {

    private static Cataloge bibliteca;
    private List<Book> books;

    private Cataloge(){
        this.books = new ArrayList<>();
    }

    public static Cataloge getInstance() {
        if(bibliteca == null){
            bibliteca = new Cataloge();
        }
        return bibliteca;
    }

}
