package com.company.dao.library;

import com.company.entities.Book;
import com.company.entities.Library;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DaoLibrarySerializable implements DaoLibrary, Serializable {
    private static String bookFile = "books.txt";
    private List<Book> library = new ArrayList<>();

    public void getBooks(){
        leer();
        Library.getInstance().setBooks(library);
    }
    public void setBooks(){
        this.library=Library.getInstance().getBooks();
        save();
    }
    @Override
    public void save() {
        try {
            FileOutputStream fos = new FileOutputStream(bookFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(library);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @Override
    public void leer() {
        try{
            FileInputStream fis =new FileInputStream(bookFile);
            ObjectInputStream ois= new ObjectInputStream(fis);
            library= (List<Book>) ois.readObject();
        }
        catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

