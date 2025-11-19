package modules.menu.impl;

import com.sun.tools.javac.Main;
import modules.menu.Menu;
import modules.menu.MenuManager;

public class MainMenu implements Menu {
    @Override
    public String name() {
        return "main";
    }

    @Override
    public void run(MenuManager menuManager) {
        System.out.println("Main menu!");
    }

    @Override
    public void close() {}
}