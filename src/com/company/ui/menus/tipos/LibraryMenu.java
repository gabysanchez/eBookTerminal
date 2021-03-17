package com.company.ui.menus.tipos;

import com.company.aplication.Controller;
import com.company.dao.DAOFactory;
import com.company.entities.Book;
import com.company.entities.Library;
import com.company.ui.menus.ListMenu;

import java.util.List;

public class LibraryMenu extends ListMenu {
    public LibraryMenu(List<String> opcionsMenu, String icon) {
        super(opcionsMenu, icon);
    }

    @Override
    public void condition(String comand) {
        DAOFactory.getInstance().getDaoLibrary().getBooks();
        Library.getInstance().deleteBook(comand);

    }
}
