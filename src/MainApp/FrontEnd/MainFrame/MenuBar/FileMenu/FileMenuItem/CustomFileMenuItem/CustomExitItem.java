/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.MenuBar.FileMenu.FileMenuItem.CustomFileMenuItem;

import MainApp.BackEnd.Utils.ImageUtils;
import MainApp.FrontEnd.MainFrame.MainFrame;
import MainApp.resource.Constant;
import java.awt.AWTEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JMenuItem;

/**
 *
 * @author NghiaDTSE05330
 */
public class CustomExitItem extends JMenuItem implements ActionListener{

    public CustomExitItem() {
        super(Constant.filemenu_exit);
        this.setIcon(ImageUtils.getScaledIco(Constant.filemenu_icExit, 20, 20));
        this.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MainFrame.getInstance().dispatchEvent(new WindowEvent(MainFrame.getInstance(),WindowEvent.WINDOW_CLOSING) {
        });
    }
    
}
