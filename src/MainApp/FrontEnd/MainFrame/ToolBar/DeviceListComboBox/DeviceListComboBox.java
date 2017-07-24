/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.ToolBar.DeviceListComboBox;

import javax.swing.JComboBox;

/**
 *
 * @author NghiaDTSE05330
 */
public class DeviceListComboBox {

    private DeviceListComboBox() {
    }

    public static CustomDeviceListComboBox getInstance() {
        return DeviceListComboBoxHolder.INSTANCE;
    }

    private static class DeviceListComboBoxHolder {

        private static final CustomDeviceListComboBox INSTANCE = new CustomDeviceListComboBox();
    }
}
