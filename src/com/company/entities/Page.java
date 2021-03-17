package com.company.entities;

import java.util.List;

public class Page {
    private String[] text;

    public Page(String[] text) {
        this.text = text;
    }

    public String[] getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Page{" +
                "text='" + text + '\'' +
                '}';
    }
}
