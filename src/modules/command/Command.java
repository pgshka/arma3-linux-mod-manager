package modules.command;

import modules.menu.base.MenuBase;

public interface Command {
    String name();
    void execute(String[] args);
}
