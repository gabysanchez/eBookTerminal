package com.company;

import com.company.aplication.Controller;
import com.company.ui.MenuBuilder;
import com.company.ui.menus.Menu;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       // String tx= Controller.lee("el_quijote.txt");
       // System.out.println(tx);

        Menu menu = MenuBuilder.getMenu("mainMenu");
        menu.draw();
	// write your code here



    }
}
