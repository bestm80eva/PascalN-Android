/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.ToolBar.ToolBarButton.ToolBarItem;

import MainApp.BackEnd.ClientSocket.SocketThread;
import MainApp.BackEnd.Utils.ImageUtils;
import MainApp.BackEnd.adb.clientAdb;
import MainApp.BackEnd.fpc.clientFpc;
import MainApp.FrontEnd.MainFrame.Editor.CodeEditor;
import MainApp.FrontEnd.MainFrame.ToolBar.DeviceListComboBox.DeviceListComboBox;
import MainApp.resource.Constant;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import javax.swing.JButton;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author NghiaDTSE05330
 */
public class CustomRunFileButton extends JButton implements ActionListener {
    
    public CustomRunFileButton() {
        
        super();
        this.setIcon(ImageUtils.getScaledIco(Constant.toolbar_icRunFile, 25, 25));
        this.setSize(30, 30);
        this.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        CodeEditor.getInstance().saveToFile(CodeEditor.getInstance().getCurrentFile());
        if (DeviceListComboBox.getInstance().getSelectedIndex() == 0) {
            clientFpc.getInstance().execute(CodeEditor.getInstance().getCurrentFile());
        } else {
            Thread socketThread = new Thread(new SocketThread());
            clientAdb.getInstance().createConnection(Integer.parseInt(Constant.con_port));
            socketThread.start();
        }
        
    }
    
}
