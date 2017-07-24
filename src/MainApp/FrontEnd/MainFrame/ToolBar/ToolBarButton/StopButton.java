/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.ToolBar.ToolBarButton;

import MainApp.FrontEnd.MainFrame.ToolBar.ToolBarButton.ToolBarItem.CustomStopButton;
import javax.swing.JButton;

/**
 *
 * @author NghiaDTSE05330
 */
public class StopButton {

    private StopButton() {
    }

    public static JButton getInstance() {
        return StopButtonHolder.INSTANCE;
    }

    private static class StopButtonHolder {

        private static final JButton INSTANCE = new CustomStopButton();
    }
}
