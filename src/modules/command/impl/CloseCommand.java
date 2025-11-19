package modules.command.impl;

import modules.command.base.CommandBase;
import modules.menu.Menu;
import modules.menu.base.MenuBase;

public class CloseCommand extends CommandBase {

    public CloseCommand(MenuBase menu) {
        super(menu);
    }

    @Override
    public String name() {
        return "close";
    }

    @Override
    public void execute(String[] args) {

    }
}
