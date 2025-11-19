package modules.menu.impl;

import modules.command.impl.OpenCatMenuCommand;
import modules.menu.MenuManager;
import modules.menu.base.MenuBase;

public class MainMenu extends MenuBase {
    public MainMenu() {
        super();
        commandManager.register(new OpenCatMenuCommand(this));
    }

    @Override
    public String name() {
        return "main";
    }

    @Override
    public void run(MenuManager menuManager) {
        super.run(menuManager);
    }

    @Override
    public void close() {}
}