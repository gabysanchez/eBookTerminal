package com.company.ui.menus;

import com.company.ui.MenuBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MainMenu extends Menu{

    public MainMenu(List<String> opcionsMenu, String icon) {
        super(opcionsMenu, icon);
    }

    @Override
    public void draw() {
        Scanner scaner = new Scanner(System.in);
        for (int i = 0; i < getOpcionsMenu().size(); i++) {
            System.out.println((i+1)+") "+getOpcionsMenu().get(i));
        }
        System.out.print("  Select option: ");
        String comand = scaner.nextLine();
        condition(comand);
    }

    @Override
    public void condition(String comand) {
        /*
        switch (comand){
            case "1":

                break;
            case "2": break;
            case "3": break;
            case "4": break;
            default: break;
        }

         */
        Menu menus = MenuBuilder.getMenu(comand);
    }
}
