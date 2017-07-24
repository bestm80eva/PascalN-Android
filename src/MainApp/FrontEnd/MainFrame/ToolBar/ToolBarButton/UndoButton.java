/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.ToolBar.ToolBarButton;

import MainApp.FrontEnd.MainFrame.ToolBar.ToolBarButton.ToolBarItem.CustomUndoButton;
import javax.swing.JButton;

/**
 *
 * @author NghiaDTSE05330
 */
public class UndoButton {

    private UndoButton() {
    }

    public static JButton getInstance() {
        return UndoButtonHolder.INSTANCE;
    }

    private static class UndoButtonHolder {

        private static final JButton INSTANCE = new CustomUndoButton();
    }
}
