/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.ToolBar.ToolBarButton;

import MainApp.FrontEnd.MainFrame.ToolBar.ToolBarButton.ToolBarItem.CustomNewFileButton;
import javax.swing.JButton;

/**
 *
 * @author NghiaDTSE05330
 */
public class NewFileButton {

    private NewFileButton() {
    }

    public static JButton getInstance() {
        return NewFileButtonHolder.INSTANCE;
    }

    private static class NewFileButtonHolder {

        private static final JButton INSTANCE = new CustomNewFileButton();
    }
}
