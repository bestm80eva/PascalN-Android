/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.ToolBar.ToolBarButton.ToolBarItem;

import MainApp.BackEnd.Utils.ImageUtils;
import MainApp.FrontEnd.MainFrame.Editor.CodeEditor;
import MainApp.resource.Constant;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author NghiaDTSE05330
 */
public class CustomStopButton extends JButton implements ActionListener {

    public CustomStopButton() {
        super();
        this.setIcon(ImageUtils.getScaledIco(Constant.toolbar_icRunFile, 25, 25));
        this.setSize(30, 30);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (CodeEditor.getInstance().getExeTemp() != null) {
                Runtime.getRuntime().exec("taskkill /F /IM " + CodeEditor.getInstance().getExeTemp().getName());
                CodeEditor.getInstance().getExeTemp().delete();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
