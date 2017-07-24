/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.ToolBar.ToolBarButton;

import MainApp.FrontEnd.MainFrame.ToolBar.ToolBarButton.ToolBarItem.CustomRedoButton;
import javax.swing.JButton;

/**
 *
 * @author NghiaDTSE05330
 */
public class RedoButton {

    private RedoButton() {
    }

    public static JButton getInstance() {
        return RedoButtonHolder.INSTANCE;
    }

    private static class RedoButtonHolder {

        private static final JButton INSTANCE = new CustomRedoButton();
    }
}
