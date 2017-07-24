/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.MenuBar.EditMenu.EditMenuItem.CustomEditMenuitem;

import MainApp.BackEnd.Utils.ImageUtils;
import MainApp.BackEnd.Utils.UndoButtonUtils;
import MainApp.FrontEnd.MainFrame.Editor.CodeEditor;
import MainApp.FrontEnd.MainFrame.Editor.EditorTextArea.CustomTextArea;
import MainApp.resource.Constant;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

/**
 *
 * @author NghiaDTSE05330
 */
public class CustomUndoItem extends JMenuItem implements ActionListener{

    public CustomUndoItem() {
        super(Constant.editmmenu_undo);
        this.setIcon(ImageUtils.getScaledIco(Constant.editmenu_icDeactiveUndo, 20, 20));
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (((CustomTextArea)CodeEditor.getInstance().getTextArea()).getCodeEditorUndoManager().canUndo()){
             ((CustomTextArea)CodeEditor.getInstance().getTextArea()).getCodeEditorUndoManager().undo();
             UndoButtonUtils.reloadIcon();
         }
    }
    
}
