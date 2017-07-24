/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.BackEnd.Utils;

import MainApp.FrontEnd.MainFrame.Editor.CodeEditor;
import MainApp.FrontEnd.MainFrame.Editor.EditorTextArea.CustomTextArea;
import MainApp.FrontEnd.MainFrame.MenuBar.EditMenu.EditMenuItem.CustomEditMenuitem.CustomRedoItem;
import MainApp.FrontEnd.MainFrame.MenuBar.EditMenu.EditMenuItem.RedoItem;
import MainApp.FrontEnd.MainFrame.MenuBar.EditMenu.EditMenuItem.UndoItem;
import MainApp.FrontEnd.MainFrame.ToolBar.ToolBarButton.RedoButton;
import MainApp.FrontEnd.MainFrame.ToolBar.ToolBarButton.UndoButton;
import MainApp.resource.Constant;

/**
 *
 * @author NghiaDTSE05330
 */
public class UndoButtonUtils {
    public static void reloadIcon(){
        CustomTextArea customTextArea = (CustomTextArea)CodeEditor.getInstance().getTextArea();
                if (customTextArea.getCodeEditorUndoManager().canRedo()){
                    RedoItem.getInstance().setIcon(ImageUtils.getScaledIco(Constant.editmenu_icActiveRedo, 20, 20));
                    RedoButton.getInstance().setIcon(ImageUtils.getScaledIco(Constant.toolbar_icActiveRedo, 25, 25));
                } else {
                    RedoItem.getInstance().setIcon(ImageUtils.getScaledIco(Constant.editmenu_icDeactiveRedo, 20, 20));

                    RedoButton.getInstance().setIcon(ImageUtils.getScaledIco(Constant.toolbar_icDeactiveRedo, 25, 25));
                }

                if (customTextArea.getCodeEditorUndoManager().canUndo()) {
                    UndoItem.getInstance().setIcon(ImageUtils.getScaledIco(Constant.editmenu_icActiveUndo, 20, 20));
                    UndoButton.getInstance().setIcon(ImageUtils.getScaledIco(Constant.toolbar_icActiveUndo, 25, 25));
                } else {
                    UndoItem.getInstance().setIcon(ImageUtils.getScaledIco(Constant.editmenu_icDeactiveUndo, 20, 20));

                    UndoButton.getInstance().setIcon(ImageUtils.getScaledIco(Constant.toolbar_icDeactiveUndo, 25, 25));
                }
    }
}
