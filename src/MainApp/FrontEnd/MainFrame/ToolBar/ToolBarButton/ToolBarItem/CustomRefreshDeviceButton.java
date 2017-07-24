/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.ToolBar.ToolBarButton.ToolBarItem;

import MainApp.BackEnd.DataStruct.MobileDevice;
import MainApp.FrontEnd.MainFrame.Editor.CodeEditor;
import MainApp.BackEnd.Utils.ImageUtils;
import MainApp.BackEnd.adb.clientAdb;
import MainApp.FrontEnd.MainFrame.ToolBar.DeviceListComboBox.DeviceListComboBox;
import MainApp.resource.Constant;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.text.BadLocationException;
import javax.swing.tree.DefaultTreeCellEditor;
import org.fife.ui.rtextarea.RTextScrollPane;

/**
 *
 * @author NghiaDTSE05330
 */
public class CustomRefreshDeviceButton extends JButton implements ActionListener {

    public CustomRefreshDeviceButton() {
        super();
        this.setIcon(ImageUtils.getScaledIco(Constant.toolbar_icRefresh, 20, 20));
        this.setSize(30, 30);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        clientAdb.getInstance().refresh();
        //clientAdb.getInstance().removeSocket();
        clientAdb.getInstance().createConnection(6699);
    }

}
