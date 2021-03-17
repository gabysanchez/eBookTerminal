package com.company.ui.menus;

import java.util.List;
import java.util.Scanner;

public class ListMenu extends Menu{

    public ListMenu(List<String> opcionsMenu, String icon) {
        super(opcionsMenu, icon);
    }

    @Override
    public void draw() {
        limpiar();
        System.out.println(getIcon());
        System.out.println("");
        Scanner scaner = new Scanner(System.in);
        for (int i = 0; i < getOpcionsMenu().size(); i++) {
            System.out.print("  ["+(i+1)+" "+getOpcionsMenu().get(i)+"]");
            if (i%2!=0&&i>0){
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println("*--------------------*");
        System.out.print("  Select título: ");
        String comand = scaner.nextLine();
        Integer select = Integer.parseInt(comand);
        for (int i = 0; i < getOpcionsMenu().size(); i++) {
            comand=getOpcionsMenu().get(select-1);
        }
        condition(comand);
    }

    @Override
    public void condition(String comand) {

    }
}
