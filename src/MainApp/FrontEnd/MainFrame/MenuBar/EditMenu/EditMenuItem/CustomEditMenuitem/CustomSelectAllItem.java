/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.MenuBar.EditMenu.EditMenuItem.CustomEditMenuitem;

import MainApp.BackEnd.Utils.ImageUtils;
import MainApp.FrontEnd.MainFrame.Editor.CodeEditor;
import MainApp.resource.Constant;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

/**
 *
 * @author NghiaDTSE05330
 */
public class CustomSelectAllItem extends JMenuItem implements ActionListener {

    public CustomSelectAllItem() {
        super(Constant.editMenu_selectAll);
        this.setIcon(ImageUtils.getScaledIco(Constant.editmenu_icSelectAll, 20, 20));
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CodeEditor.getInstance().getTextArea().selectAll();

    }
}
