package com.company.ui;

import com.company.ui.menus.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MenuBuilder {

   public static Menu getMenu(String command){
       List<String> titulos = Arrays.asList("Read Book","Catalogue","Edit library","Exit");
     //  HashMap<String,Menu> menus = new HashMap<>();
       Menu menu = null;
       switch (command) {
           case "mainMenu" -> {
               menu = new MainMenu(Arrays.asList("Read Book", "Catalogue", "Edit library", "Exit"),
                       " __________________________ \n" +
                               "|  ____    ____     _  __  |\n" +
                               "|_|**|*|__|+|+||___| ||  | |\n" +
                               "| |~~|~|  |=|=|| | |~||==| |\n" +
                               "|-|  | |==|+|+||-|-|~||__| |\n" +
                               "|_|__|_|__|_|_||_|_|_||__|_|\n" +
                               "|__________________________|");
           }
           case "1" -> {
               menu = new BooksMenu(titulos,
                       "╔╗ ┌─┐┌─┐┬┌─┌─┐\n" +
                            "╠╩╗│ ││ │├┴┐└─┐\n" +
                            "╚═╝└─┘└─┘┴ ┴└─┘");
           }
           case "2"-> {
               menu = new LibraryMenu(titulos,
                       "╔╗ ┌─┐┌─┐┬┌─┌─┐\n" +
                            "╠╩╗│ ││ │├┴┐└─┐\n" +
                            "╚═╝└─┘└─┘┴ ┴└─┘");
           }
           case "3"-> {
               menu = new CatalogeMenu(titulos,
                       "╔╗ ┌─┐┌─┐┬┌─┌─┐\n" +
                            "╠╩╗│ ││ │├┴┐└─┐\n" +
                            "╚═╝└─┘└─┘┴ ┴└─┘");
           }
       }
       return menu;
   }
}
