/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.MenuBar.EditMenu.EditMenuItem;

import MainApp.FrontEnd.MainFrame.MenuBar.EditMenu.EditMenuItem.CustomEditMenuitem.CustomRedoItem;
import javax.swing.JMenuItem;

/**
 *
 * @author NghiaDTSE05330
 */
public class RedoItem {
    
    private RedoItem() {
    }
    
    public static JMenuItem getInstance() {
        return RedoItemHolder.INSTANCE;
    }
    
    private static class RedoItemHolder {

        private static final JMenuItem INSTANCE = new CustomRedoItem();
    }
}
