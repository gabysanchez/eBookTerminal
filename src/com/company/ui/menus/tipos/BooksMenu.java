package com.company.ui.menus.tipos;

import com.company.aplication.Controller;
import com.company.entities.Library;
import com.company.ui.menus.ListMenu;

import java.util.List;

public class BooksMenu extends ListMenu {


    public BooksMenu(List<String> opcionsMenu, String icon) {
        super(opcionsMenu, icon);
    }

    @Override
    public void condition(String comand) {
        if (comand.equals("1")){
            Controller.mostrar(Library.getInstance().getBooks().get(0));
        }
    }
}
