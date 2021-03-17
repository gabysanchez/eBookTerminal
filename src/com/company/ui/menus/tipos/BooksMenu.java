package com.company.ui.menus.tipos;

import com.company.aplication.Controller;
import com.company.dao.DAOFactory;
import com.company.entities.Library;
import com.company.ui.menus.ListMenu;

import java.util.List;

public class BooksMenu extends ListMenu {


    public BooksMenu(List<String> opcionsMenu, String icon) {
        super(opcionsMenu, icon);
    }

    @Override
    public void condition(String comand) {
        DAOFactory.getInstance().getDaoLibrary().getBooks();
        int nBook = 0;
        for (int i = 0; i < Library.getInstance().getBooks().size(); i++) {
            if (comand.equals(Library.getInstance().getBooks().get(i).getTitle())){
                nBook=i;
                break;
            }
        }
        Controller.mostrar(Library.getInstance().getBooks().get(nBook),0);
    }
}
