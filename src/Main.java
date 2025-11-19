
import modules.menu.Menu;
import modules.menu.MenuManager;
import modules.menu.base.MenuBase;

void main() {
    MenuManager menuManager = new MenuManager();
    Scanner scanner = new Scanner(System.in);
    while (true)
    {
       String command = scanner.nextLine();
       MenuBase menu = menuManager.getCurrentMenu();
       if (menu != null)
       {
           menu.getCommandManager().executeCommand(command);
       }
       System.out.println("> " + command);
    }
}
