/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.MenuBar.EditMenu.EditMenuItem;

import MainApp.FrontEnd.MainFrame.MenuBar.EditMenu.EditMenuItem.CustomEditMenuitem.CustomCutItem;
import javax.swing.JMenuItem;

/**
 *
 * @author NghiaDTSE05330
 */
public class CutItem {

    private CutItem() {
    }

    public static JMenuItem getInstance() {
        return CutItemHolder.INSTANCE;
    }

    private static class CutItemHolder {

        private static final JMenuItem INSTANCE = new CustomCutItem();
    }
}
