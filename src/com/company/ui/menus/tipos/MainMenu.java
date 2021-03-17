package com.company.ui.menus.tipos;

import com.company.ui.MenuBuilder;
import com.company.ui.menus.Menu;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MainMenu extends Menu {

    public MainMenu(List<String> opcionsMenu, String icon) {
        super(opcionsMenu, icon);
    }

    @Override
    public void draw() {
        System.out.println(getIcon());
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
        Menu menu = MenuBuilder.getMenu(comand);
        menu.draw();
    }
}
