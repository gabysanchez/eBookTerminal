package com.company.ui.menus;

import java.util.List;

public class ListMenu extends Menu{

    public ListMenu(List<String> opcionsMenu, String icon) {
        super(opcionsMenu, icon);
    }

    @Override
    public void draw() {
        for (int i = 0; i < getOpcionsMenu().size(); i++) {
            System.out.print("["+getOpcionsMenu().get(i)+"]     ");
            if (i<getOpcionsMenu().size())
            System.out.println();
        }
    }
}
