/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.MenuBar;

import MainApp.FrontEnd.MainFrame.MenuBar.EditMenu.EditMenu;
import MainApp.FrontEnd.MainFrame.MenuBar.FileMenu.FileMenu;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

/**
 *
 * @author NghiaDTSE05330
 */
public class CustomMenuBar extends JMenuBar {

    public CustomMenuBar() {
        super();

        this.add(FileMenu.getInstance());
        this.add(EditMenu.getInstance());
    }

}
