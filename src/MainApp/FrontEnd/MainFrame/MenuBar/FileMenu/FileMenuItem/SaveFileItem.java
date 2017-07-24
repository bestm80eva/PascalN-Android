/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.MenuBar.FileMenu.FileMenuItem;

import MainApp.FrontEnd.MainFrame.MenuBar.FileMenu.FileMenuItem.CustomFileMenuItem.CustomSaveFileItem;
import javax.swing.JMenuItem;

/**
 *
 * @author NghiaDTSE05330
 */
public class SaveFileItem {

    private SaveFileItem() {
    }

    public static JMenuItem getInstance() {
        return SaveFileItemHolder.INSTANCE;
    }

    private static class SaveFileItemHolder {

        private static final JMenuItem INSTANCE = new CustomSaveFileItem();
    }
}
