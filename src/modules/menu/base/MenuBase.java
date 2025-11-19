package modules.menu.base;

import lombok.Getter;
import modules.command.CommandManager;
import modules.command.impl.CloseCommand;
import modules.menu.Menu;
import modules.menu.MenuManager;

public abstract class MenuBase implements Menu {
    @Getter
    protected CommandManager commandManager;

    @Getter
    protected MenuManager menuManager;

    public MenuBase() {
        this.commandManager = new CommandManager();
        commandManager.register(new CloseCommand(this));
    }

    @Override
    public void run(MenuManager menuManager) {
        commandManager.listCommands();
        this.menuManager = menuManager;
    }
}