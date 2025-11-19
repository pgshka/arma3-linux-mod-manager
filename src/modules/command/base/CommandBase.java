package modules.command.base;

import lombok.Getter;
import modules.command.Command;
import modules.menu.Menu;
import modules.menu.base.MenuBase;

public abstract class CommandBase implements Command {
    @Getter
    protected MenuBase menu;

    public CommandBase(MenuBase menu) {
        this.menu = menu;
    }
}