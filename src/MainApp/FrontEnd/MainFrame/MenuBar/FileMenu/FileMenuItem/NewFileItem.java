/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.MenuBar.FileMenu.FileMenuItem;

import MainApp.FrontEnd.MainFrame.MenuBar.FileMenu.FileMenuItem.CustomFileMenuItem.CustomNewFIleItem;
import javax.swing.JMenuItem;

/**
 *
 * @author NghiaDTSE05330
 */
public class NewFileItem {

    private NewFileItem() {
    }

    public static JMenuItem getInstance() {
        return NewItemHolder.INSTANCE;
    }

    private static class NewItemHolder {

        private static final JMenuItem INSTANCE = new CustomNewFIleItem();
    }
}
