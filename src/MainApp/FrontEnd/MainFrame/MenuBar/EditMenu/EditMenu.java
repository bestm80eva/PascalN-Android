/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.MenuBar.EditMenu;

import MainApp.FrontEnd.MainFrame.MenuBar.FileMenu.CustomEditMenu;
import javax.swing.JMenu;

/**
 *
 * @author NghiaDTSE05330
 */
public class EditMenu {

    private EditMenu() {
    }

    public static JMenu getInstance() {
        return FileMenuHolder.INSTANCE;
    }

    private static class FileMenuHolder {

        private static final JMenu INSTANCE = new CustomEditMenu();
    }
}
