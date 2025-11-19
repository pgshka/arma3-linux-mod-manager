package modules.menu;

import lombok.Getter;
import modules.menu.base.MenuBase;
import modules.menu.impl.CatMenu;
import modules.menu.impl.MainMenu;

import java.util.ArrayList;
import java.util.List;

public class MenuManager {
    protected List<MenuBase> menuList = new ArrayList<>();

    @Getter
    protected MenuBase currentMenu;

    public MenuManager() {
        menuList.add(new MainMenu()); //так же надо добавить в MenuConstanst
        menuList.add(new CatMenu());
        open(MenuConstants.MAIN_MENU);
    }

    public void open(int index)
    {
        MenuBase menu = menuList.get(index);
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
        open(MenuConstants.MAIN_MENU);
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
