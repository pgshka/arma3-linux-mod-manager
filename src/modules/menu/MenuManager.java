package modules.menu;

import modules.menu.impl.CatMenu;
import modules.menu.impl.MainMenu;

import java.util.ArrayList;
import java.util.List;

public class MenuManager {
    protected List<Menu> menuList = new ArrayList<>();
    protected Menu currentMenu;

    public MenuManager() {
        menuList.add(new MainMenu());
        menuList.add(new CatMenu());
        open(0);
    }

    public void open(int index)
    {
        Menu menu = menuList.get(index);
        if (menu != null)
        {
            currentMenu = menu;
            menu.run(this);
        }
    }

    public void close()
    {
        //зачем снова открывать мейн меню ?
        if (currentMenu instanceof MainMenu)
            return;

        currentMenu.close();
        open(0);
    }

    public List<String> GetListOfNames()
    {
        List<String> list = new ArrayList<>();
        for (Menu menu : menuList)
        {
            list.add(menu.name());
        }

        return list;
    }
}
