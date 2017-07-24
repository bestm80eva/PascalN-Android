/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.MenuBar.EditMenu.EditMenuItem;

import MainApp.FrontEnd.MainFrame.MenuBar.EditMenu.EditMenuItem.CustomEditMenuitem.CustomCopyItem;
import javax.swing.JMenuItem;

/**
 *
 * @author NghiaDTSE05330
 */
public class CopyItem {

    private CopyItem() {
    }

    public static JMenuItem getInstance() {
        return CopyItemHolder.INSTANCE;
    }

    private static class CopyItemHolder {

        private static final JMenuItem INSTANCE = new CustomCopyItem();
    }
}
