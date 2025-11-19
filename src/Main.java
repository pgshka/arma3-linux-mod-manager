
import modules.menu.MenuManager;
void main() {
    MenuManager menuManager = new MenuManager();
    Scanner scanner = new Scanner(System.in);
    while (true)
    {
       String word = scanner.nextLine();
       System.out.println("> " + word);
    }
}
