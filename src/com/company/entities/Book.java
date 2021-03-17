package com.company.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Book implements Serializable {
    private String title;
    private List<Page> pages;;

    public Book(String title) {
        this.title = title;
        this.pages = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public List<Page> getPages() {
        return pages;
    }

    public void add(Page page){
        this.pages.add(page);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }
}
