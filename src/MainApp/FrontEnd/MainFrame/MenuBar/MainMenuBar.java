/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.MenuBar;

import javax.swing.JMenuBar;

/**
 *
 * @author NghiaDTSE05330
 */
public class MainMenuBar {

    private MainMenuBar() {
    }

    public static JMenuBar getInstance() {
        return MainMenuBarHolder.INSTANCE;
    }

    private static class MainMenuBarHolder {

        private static final JMenuBar INSTANCE = new CustomMenuBar();
    }
}
