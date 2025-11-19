package modules.menu.impl;

import modules.command.CommandManager;
import modules.menu.Menu;
import modules.menu.MenuManager;
import modules.menu.base.MenuBase;

public class CatMenu extends MenuBase {
    public CatMenu() {
        super();
    }

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