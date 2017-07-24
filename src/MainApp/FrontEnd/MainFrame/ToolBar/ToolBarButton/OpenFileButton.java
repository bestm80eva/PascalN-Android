/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.ToolBar.ToolBarButton;

import MainApp.FrontEnd.MainFrame.ToolBar.ToolBarButton.ToolBarItem.CustomOpenFileButton;
import javax.swing.JButton;

/**
 *
 * @author NghiaDTSE05330
 */
public class OpenFileButton {

    private OpenFileButton() {
    }

    public static JButton getInstance() {
        return OpenFileButtonHolder.INSTANCE;
    }

    private static class OpenFileButtonHolder {

        private static final JButton INSTANCE = new CustomOpenFileButton();
    }
}
