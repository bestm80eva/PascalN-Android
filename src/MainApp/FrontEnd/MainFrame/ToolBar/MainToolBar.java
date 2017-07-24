/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.ToolBar;

import javax.swing.JToolBar;

/**
 *
 * @author NghiaDTSE05330
 */
public class MainToolBar {

    private MainToolBar() {
    }

    public static JToolBar getInstance() {
        return MainToolBarHolder.INSTANCE;
    }

    private static class MainToolBarHolder {

        private static final JToolBar INSTANCE = (JToolBar) new CustomToolBar();
    }
}
