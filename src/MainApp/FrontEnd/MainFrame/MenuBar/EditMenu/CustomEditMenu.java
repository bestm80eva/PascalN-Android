/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.MenuBar.FileMenu;

import MainApp.FrontEnd.MainFrame.MenuBar.EditMenu.EditMenuItem.CopyItem;
import MainApp.FrontEnd.MainFrame.MenuBar.EditMenu.EditMenuItem.CustomEditMenuitem.CustomPasteItem;
import MainApp.FrontEnd.MainFrame.MenuBar.EditMenu.EditMenuItem.CustomEditMenuitem.CustomCutItem;
import MainApp.FrontEnd.MainFrame.MenuBar.EditMenu.EditMenuItem.CustomEditMenuitem.CustomUndoItem;
import MainApp.FrontEnd.MainFrame.MenuBar.EditMenu.EditMenuItem.CustomEditMenuitem.CustomCopyItem;
import MainApp.FrontEnd.MainFrame.MenuBar.EditMenu.EditMenuItem.CustomEditMenuitem.CustomRedoItem;
import MainApp.FrontEnd.MainFrame.MenuBar.EditMenu.EditMenuItem.CutItem;
import MainApp.FrontEnd.MainFrame.MenuBar.EditMenu.EditMenuItem.RedoItem;
import MainApp.FrontEnd.MainFrame.MenuBar.EditMenu.EditMenuItem.SelectAllItem;
import MainApp.FrontEnd.MainFrame.MenuBar.EditMenu.EditMenuItem.UndoItem;
import MainApp.resource.Constant;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.JMenu;
import org.fife.ui.rtextarea.RTextAreaEditorKit;

/**
 *
 * @author NghiaDTSE05330
 */
public class CustomEditMenu extends JMenu {

    public CustomEditMenu() {
        super();
        this.setText(Constant.editemenu_name);
        this.setMnemonic(KeyEvent.VK_F);

        this.setFont(new Font(this.getFont().getName(), this.getFont().getStyle(), 15));
        //Add menu item
        this.add(UndoItem.getInstance());
        this.add(RedoItem.getInstance());
        this.addSeparator();

        this.add(CutItem.getInstance());
        this.add(CopyItem.getInstance());
        this.addSeparator();

        this.add(SelectAllItem.getInstance());
    }

}
