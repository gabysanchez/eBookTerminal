package com.company.entities;

import java.io.Serializable;
import java.util.List;

public class Page implements Serializable {
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
