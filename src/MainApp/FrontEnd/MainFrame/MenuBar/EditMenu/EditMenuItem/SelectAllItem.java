/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.MenuBar.EditMenu.EditMenuItem;

import MainApp.FrontEnd.MainFrame.MenuBar.EditMenu.EditMenuItem.CustomEditMenuitem.CustomSelectAllItem;
import javax.swing.JMenuItem;

/**
 *
 * @author NghiaDTSE05330
 */
public class SelectAllItem {

    private SelectAllItem() {
    }

    public static JMenuItem getInstance() {
        return SelectAllItemHolder.INSTANCE;
    }

    private static class SelectAllItemHolder {

        private static final JMenuItem INSTANCE = new CustomSelectAllItem();
    }
}
