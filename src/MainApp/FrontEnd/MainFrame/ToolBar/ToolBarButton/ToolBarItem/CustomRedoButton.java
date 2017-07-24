/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.ToolBar.ToolBarButton.ToolBarItem;

import MainApp.BackEnd.Utils.ImageUtils;
import MainApp.BackEnd.Utils.UndoButtonUtils;
import MainApp.FrontEnd.MainFrame.Editor.EditorTextArea.CustomTextArea;
import MainApp.FrontEnd.MainFrame.Editor.EditorTextArea.TextArea;
import MainApp.FrontEnd.MainFrame.ToolBar.ToolBarButton.UndoButton;
import MainApp.resource.Constant;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author NghiaDTSE05330
 */
public class CustomRedoButton extends JButton implements ActionListener {

    public CustomRedoButton() {
        super();
        this.setIcon(ImageUtils.getScaledIco(Constant.toolbar_icDeactiveRedo, 25, 25));
        this.setSize(30, 30);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CustomTextArea textarea = (CustomTextArea) TextArea.getInstance();
        if (textarea.getCodeEditorUndoManager().canRedo()) {
            this.setIcon(ImageUtils.getScaledIco(Constant.toolbar_icActiveRedo, 25, 25));
            textarea.getCodeEditorUndoManager().redo();
        } else {
            this.setIcon(ImageUtils.getScaledIco(Constant.toolbar_icDeactiveRedo, 25, 25));
        }
        UndoButtonUtils.reloadIcon();

    }

}
