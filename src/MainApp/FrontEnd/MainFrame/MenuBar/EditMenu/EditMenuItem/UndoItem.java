/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.MenuBar.EditMenu.EditMenuItem;

import MainApp.FrontEnd.MainFrame.MenuBar.EditMenu.EditMenuItem.CustomEditMenuitem.CustomUndoItem;
import javax.swing.JMenuItem;

/**
 *
 * @author NghiaDTSE05330
 */
public class UndoItem {
    
    private UndoItem() {
    }
    
    public static JMenuItem getInstance() {
        return UndoItemHolder.INSTANCE;
    }
    
    private static class UndoItemHolder {

        private static final JMenuItem INSTANCE = new CustomUndoItem();
    }
}
