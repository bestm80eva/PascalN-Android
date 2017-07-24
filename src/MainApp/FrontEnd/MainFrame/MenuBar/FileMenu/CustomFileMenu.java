/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.MenuBar.FileMenu;

import MainApp.FrontEnd.MainFrame.MenuBar.FileMenu.FileMenuItem.CustomFileMenuItem.CustomExitItem;
import MainApp.FrontEnd.MainFrame.MenuBar.FileMenu.FileMenuItem.CustomFileMenuItem.CustomSaveFileAsItem;
import MainApp.FrontEnd.MainFrame.MenuBar.FileMenu.FileMenuItem.CustomFileMenuItem.CustomNewFIleItem;
import MainApp.FrontEnd.MainFrame.MenuBar.FileMenu.FileMenuItem.CustomFileMenuItem.CustomSaveFileItem;
import MainApp.FrontEnd.MainFrame.MenuBar.FileMenu.FileMenuItem.CustomFileMenuItem.CustomOpenFileItem;
import MainApp.FrontEnd.MainFrame.MenuBar.FileMenu.FileMenuItem.ExitItem;
import MainApp.FrontEnd.MainFrame.MenuBar.FileMenu.FileMenuItem.NewFileItem;
import MainApp.FrontEnd.MainFrame.MenuBar.FileMenu.FileMenuItem.OpenFileItem;
import MainApp.FrontEnd.MainFrame.MenuBar.FileMenu.FileMenuItem.SaveFileAsItem;
import MainApp.FrontEnd.MainFrame.MenuBar.FileMenu.FileMenuItem.SaveFileItem;
import MainApp.resource.Constant;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.JMenu;

/**
 *
 * @author NghiaDTSE05330
 */
public class CustomFileMenu extends JMenu {

    public CustomFileMenu() {
        super();
        this.setText(Constant.filemenu_name);
        this.setMnemonic(KeyEvent.VK_F);

        this.setFont(new Font(this.getFont().getName(), this.getFont().getStyle(), 15));
        //Add menu item
        this.add(NewFileItem.getInstance());
        this.add(OpenFileItem.getInstance());
        this.addSeparator();

        this.add(SaveFileItem.getInstance());
        this.add(SaveFileAsItem.getInstance());
        this.addSeparator();

        this.add(ExitItem.getInstance());
    }

}
