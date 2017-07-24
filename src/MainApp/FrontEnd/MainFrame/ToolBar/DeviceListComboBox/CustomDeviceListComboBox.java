/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.ToolBar.DeviceListComboBox;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author NghiaDTSE05330
 */
public class CustomDeviceListComboBox extends JComboBox<Object> {

    private DefaultComboBoxModel deviceList;

    public DefaultComboBoxModel getDeviceList() {
        return deviceList;
    }

    public void setDeviceList(DefaultComboBoxModel deviceList) {
        this.deviceList = deviceList;
    }

    public CustomDeviceListComboBox() {
        super();
        deviceList = new DefaultComboBoxModel();
        this.setPreferredSize(new Dimension(250, 25));
        this.setMaximumSize(new Dimension(250, 25));
        this.setModel(deviceList);
        try {
            deviceList.addElement(InetAddress.getLocalHost().getHostName());
        } catch (UnknownHostException ex) {
            System.out.println("Hostname can not be resolved");
        }
    }
}
