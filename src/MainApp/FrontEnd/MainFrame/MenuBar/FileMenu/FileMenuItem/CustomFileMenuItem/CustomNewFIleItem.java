/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.MenuBar.FileMenu.FileMenuItem.CustomFileMenuItem;

import MainApp.BackEnd.Utils.ImageUtils;
import MainApp.FrontEnd.MainFrame.Editor.CodeEditor;
import MainApp.MainApplication;
import javax.swing.JMenuItem;
import MainApp.resource.Constant;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author NghiaDTSE05330
 */
public class CustomNewFIleItem extends JMenuItem implements ActionListener {

    public CustomNewFIleItem() {
        super(Constant.filemenu_newFile);

        this.setIcon(ImageUtils.getScaledIco(Constant.filemenu_icNewFile, 20, 20));
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CodeEditor.getInstance().newFile();
    }

}
