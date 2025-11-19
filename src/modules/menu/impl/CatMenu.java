package modules.menu.impl;

import modules.menu.Menu;
import modules.menu.MenuManager;

public class CatMenu implements Menu {
    @Override
    public String name() {
        return "main";
    }

    @Override
    public void run(MenuManager menuManager) {
        System.out.println("Cat! ^_^");
    }

    @Override
    public void close() {}
}