/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.MenuBar.FileMenu.FileMenuItem;

import MainApp.FrontEnd.MainFrame.MenuBar.FileMenu.FileMenuItem.CustomFileMenuItem.CustomExitItem;
import javax.swing.JButton;
import javax.swing.JMenuItem;

/**
 *
 * @author NghiaDTSE05330
 */
public class ExitItem {

    private ExitItem() {
    }

    public static JMenuItem getInstance() {
        return ExitItemHolder.INSTANCE;
    }

    private static class ExitItemHolder {

        private static final JMenuItem INSTANCE = new CustomExitItem();
    }
}
