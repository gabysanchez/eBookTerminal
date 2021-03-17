package com.company.ui.menus;

import java.util.List;
import java.util.Scanner;

public abstract class Menu{


    private List<String> opcionsMenu;
    private String icon;


    public Menu(List<String> opcionsMenu, String icon) {
        this.opcionsMenu = opcionsMenu;
        this.icon = icon;
    }

    public List<String> getOpcionsMenu() {
        return opcionsMenu;
    }

    public String getIcon() {
        return icon;
    }

    public void draw() {}
    public void condition(String comand) {}
    public void limpiar(){
        for (int i = 0; i < 30; i++) {
            System.out.println("");
        }
    }
    public void generate() {}


}
