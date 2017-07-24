/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.ToolBar.ToolBarButton;

import MainApp.FrontEnd.MainFrame.ToolBar.ToolBarButton.ToolBarItem.CustomRunFileButton;
import javax.swing.JButton;

/**
 *
 * @author NghiaDTSE05330
 */
public class RunFileButton {

    private RunFileButton() {
    }

    public static JButton getInstance() {
        return RunFileButtonHolder.INSTANCE;
    }

    private static class RunFileButtonHolder {

        private static final JButton INSTANCE = new CustomRunFileButton();
    }
}
