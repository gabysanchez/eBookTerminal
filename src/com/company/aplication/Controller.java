package com.company.aplication;

import com.company.entities.Book;
import com.company.entities.Library;
import com.company.entities.Page;
import com.company.lector.Lector;
import com.company.ui.MenuBuilder;
import com.company.ui.menus.Menu;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Controller {

    /**
     * Tenemos la variable libreria que almacena una lista de libros;
     */
    private Library library;

    /**
     * <p>Cuando se descarga un libro pasa por el crador para dejar la clase Book almacenada en Library</p>
     * @since 1.0
     * @param titulo es el título del libro a crear;
     */
    public static void createBook(String titulo){
        String bookTxt = Lector.lee(titulo);
        bookTxt = bookTxt.toLowerCase(Locale.ROOT);

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
        Library.getInstance().addBook(libro);
    }
    /**
     * <p>Cuando queremos ver un Libro pasa por este metodo para dibujarse y paginarse</p>
     * @since 1.0
     * @param book Es el libro que se maquetara.
     * @param pag pag es la pagina del libro que se mostrara.
     */
    public static void mostrar(Book book,int pag) {
        limpiar();
        Scanner scaner = new Scanner(System.in);
        Page pagina = book.getPages().get(pag);
        int contPalabra=0;
        for (int i = 0; i < pagina.getText().length; i++) {
            contPalabra++;
            System.out.print(" "+pagina.getText()[i]);
            if (contPalabra>10){
                contPalabra=0;
                System.out.println(" ");
            }
        }
        System.out.println("\n");
        System.out.println("<-- 4 *** 6 -->");
        System.out.print("  >");
        String opcion = scaner.nextLine();
        if (opcion.equals("6")&&pag<book.getPages().size()-1){
            pag++;
            mostrar(book,pag);
        }else if (opcion.equals("4")&&pag>0){
            pag--;
            mostrar(book,pag);
        }else{
            limpiar();
            Menu menu = MenuBuilder.getMenu("mainMenu");
            menu.draw();
        }
    }
    /**
     * <p>Funcion sencilla para limpiar la pantalla</p>
     * @since 1.0
     */
    public static void limpiar(){
        for (int i = 0; i < 100; i++) {
            System.out.println("");
        }
    }
}
