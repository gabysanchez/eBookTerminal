package com.company.ui;

import com.company.dao.DAOFactory;
import com.company.entities.Library;
import com.company.ui.menus.*;
import com.company.ui.menus.tipos.BooksMenu;
import com.company.ui.menus.tipos.CatalogeMenu;
import com.company.ui.menus.tipos.LibraryMenu;
import com.company.ui.menus.tipos.MainMenu;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuBuilder {

   public static Menu getMenu(String command){
       List<String> titulos = new ArrayList<>();
       List<String> catalogo = new ArrayList<>();
       File folder = new File("src/recursos/");
       File[] listOfFiles = folder.listFiles();

       for (File file : listOfFiles) {
           if (file.isFile()) {
               String ruta = String.valueOf(file);
               List<String> partes = Arrays.asList(ruta.split("/"));
               String titulo = partes.get(2);
               catalogo.add(String.valueOf(titulo));
           }
       }
       DAOFactory.getInstance().getDaoLibrary().getBooks();
       Library.getInstance().getBooks().forEach(book -> {
           titulos.add(book.getTitle());
       });
     //  HashMap<String,Menu> menus = new HashMap<>();
       Menu menu = null;
       switch (command) {
           case "mainMenu" -> {
               menu = new MainMenu(Arrays.asList("Read Book", "Catalogue", "Edit library", "Exit"),
                          "     __________________________ \n" +
                               "    |  ____    ____     _  __  |\n" +
                               "    |_|**|*|__|+|+||___| ||  | |\n" +
                               "    | |~~|~|  |=|=|| | |~||==| |\n" +
                               "    |-|  | |==|+|+||-|-|~||__| |\n" +
                               "    |_|__|_|__|_|_||_|_|_||__|_|\n" +
                               "    |__________________________|");
           }
           case "1" -> {
               menu = new BooksMenu(titulos,
                       "   ╔╗ ┌─┐┌─┐┬┌─┌─┐\n" +
                            "   ╠╩╗│ ││ │├┴┐└─┐\n" +
                            "   ╚═╝└─┘└─┘┴ ┴└─┘");
           }
           case "2"-> {
               menu = new CatalogeMenu(catalogo,
                       "╔═╗┌─┐┌┬┐┌─┐┬  ┌─┐┌─┐┬ ┬┌─┐\n" +
                            "║  ├─┤ │ ├─┤│  │ ││ ┬│ │├┤ \n" +
                            "╚═╝┴ ┴ ┴ ┴ ┴┴─┘└─┘└─┘└─┘└─┘");
           }
           case "3"-> {
               menu = new LibraryMenu(titulos,
                          "  ╦  ┬┌┐ ┬─┐┌─┐┬─┐┬ ┬\n" +
                               "  ║  │├┴┐├┬┘├─┤├┬┘└┬┘\n" +
                               "  ╩═╝┴└─┘┴└─┴ ┴┴└─ ┴ ");
           }
       }
       return menu;
   }
}
