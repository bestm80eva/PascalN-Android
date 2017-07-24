/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.ToolBar.ToolBarButton;

import MainApp.FrontEnd.MainFrame.ToolBar.ToolBarButton.ToolBarItem.CustomRefreshDeviceButton;
import javax.swing.JButton;

/**
 *
 * @author NghiaDTSE05330
 */
public class RefreshDeviceButton {

    private RefreshDeviceButton() {
    }

    public static JButton getInstance() {
        return RefreshDeviceButtonHolder.INSTANCE;
    }

    private static class RefreshDeviceButtonHolder {

        private static final JButton INSTANCE = new CustomRefreshDeviceButton();
    }
}
