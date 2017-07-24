/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.ToolBar.ToolBarButton.ToolBarItem;

import MainApp.BackEnd.FileChooser.OpenFileChooser.OpenFileChooser;
import MainApp.BackEnd.FileChooser.OpenFileChooser.SingletonOpenFileChooser;
import MainApp.BackEnd.FileChooser.SaveFileChooser.SaveFileChooser;
import MainApp.BackEnd.FileChooser.SaveFileChooser.SingletonSaveFileChooser;
import MainApp.BackEnd.Utils.ImageUtils;
import MainApp.FrontEnd.MainFrame.Editor.CodeEditor;
import MainApp.resource.Constant;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;

/**
 *
 * @author NghiaDTSE05330
 */
public class CustomOpenFileButton extends JButton implements ActionListener {

    public CustomOpenFileButton() {
        super();
        this.setIcon(ImageUtils.getScaledIco(Constant.toolbar_icOpenFile, 25, 25));
        this.setSize(30, 30);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CodeEditor.getInstance().openFile();
    }

}
