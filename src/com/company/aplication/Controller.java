package com.company.aplication;

import com.company.entities.Book;
import com.company.entities.Page;
import com.company.lector.Lector;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Controller {

    public static void createBook(String titulo){
        String bookTxt = Lector.lee(titulo);
        bookTxt = bookTxt.toLowerCase(Locale.ROOT);
        /*
        List<String> caracteres = new ArrayList<>(List.of(".", ",", ";", ":", "–", "?", "¿", "!", "¡", "(", ")", "\n", "{", "}", "-", "»", "«"));
        for (String caracter : caracteres) {
            bookTxt = bookTxt.replace(caracter, "");
        }

         */
        List<String> palabras = Arrays.asList(bookTxt.split(" "));

        int contPalbra = 0;
        int contTotal = 0;
        Book libro = new Book(titulo);
        List<String> palabros = new ArrayList<>();
        for (int i = 0; i < palabras.size(); i++) {
            palabros.add(palabras.get(i));
            contPalbra++;
            contTotal++;
            if (contPalbra>200){
                contPalbra=0;
                String[] palabrasBuenas = palabros.toArray(new String[0]);
                Page page = new Page(palabrasBuenas);
                libro.add(page);
                palabros.clear();
            }else if (contTotal==palabras.size()){
                String[] palabrasBuenas = palabros.toArray(new String[0]);
                Page page = new Page(palabrasBuenas);
                libro.add(page);
            }
        }
        System.out.println(libro.getPages().get(0).getText()[1]);

       mostrar(libro);
    }

    private static Page mostrar(Book book) {

        Page pagina = book.getPages().get(0);

        int contPalabra=0;

        for (int i = 0; i < pagina.getText().length; i++) {
            contPalabra++;
            System.out.print(" "+pagina.getText()[i]);
            if (contPalabra>10){
                contPalabra=0;
                System.out.println(" ");
            }
        }
        return null;
    }

}
