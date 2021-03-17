package com.company.ui.menus.tipos;

import com.company.aplication.Controller;
import com.company.ui.MenuBuilder;
import com.company.ui.menus.ListMenu;
import com.company.ui.menus.Menu;

import java.util.List;

public class CatalogeMenu extends ListMenu {
    public CatalogeMenu(List<String> opcionsMenu, String icon) {
        super(opcionsMenu, icon);
    }
    @Override
    public void condition(String comand) {
        if (comand.equals("1")){
            Controller.createBook("el_quijote.txt");
            Menu menu = MenuBuilder.getMenu("mainMenu");
            menu.draw();
        }
    }
}
