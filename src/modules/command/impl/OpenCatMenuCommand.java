package modules.command.impl;

import modules.command.base.CommandBase;
import modules.menu.MenuConstants;
import modules.menu.base.MenuBase;

public class OpenCatMenuCommand extends CommandBase {
    public OpenCatMenuCommand(MenuBase menu) {
        super(menu);
    }

    @Override
    public String name() {
        return "cat-menu";
    }

    @Override
    public void execute(String[] args) {
        getMenu().getMenuManager().open(MenuConstants.CAT_MENU);
    }
}
