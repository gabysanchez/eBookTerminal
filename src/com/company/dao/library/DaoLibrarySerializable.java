package com.company.dao.library;

import java.io.*;

public class DaoLibrarySerializable implements DaoLibrary, Serializable {
    private String bookFile = "books.txt";
    @Override
    public void save() {
        try {
            FileOutputStream fos = new FileOutputStream(bookFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this.bookFile);
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
            this.
                    bookFile= (String) ois.readObject();
        }
        catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

