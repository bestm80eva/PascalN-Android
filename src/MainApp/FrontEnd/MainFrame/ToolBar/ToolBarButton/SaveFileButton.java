/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.ToolBar.ToolBarButton;

import MainApp.FrontEnd.MainFrame.ToolBar.ToolBarButton.ToolBarItem.CustomSaveButton;
import javax.swing.JButton;

/**
 *
 * @author NghiaDTSE05330
 */
public class SaveFileButton {

    private SaveFileButton() {
    }

    public static JButton getInstance() {
        return SaveFileButtonHolder.INSTANCE;
    }

    private static class SaveFileButtonHolder {

        private static final JButton INSTANCE = new CustomSaveButton();
    }
}
