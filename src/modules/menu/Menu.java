package modules.menu;


public interface Menu {
    String name();
    void run(MenuManager main);
    void close();
}