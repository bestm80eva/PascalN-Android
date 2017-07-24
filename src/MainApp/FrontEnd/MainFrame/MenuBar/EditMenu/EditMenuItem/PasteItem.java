/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.MenuBar.EditMenu.EditMenuItem;

import MainApp.FrontEnd.MainFrame.MenuBar.EditMenu.EditMenuItem.CustomEditMenuitem.CustomPasteItem;
import javax.swing.JMenuItem;

/**
 *
 * @author NghiaDTSE05330
 */
public class PasteItem {
    
    private PasteItem() {
    }
    
    public static JMenuItem getInstance() {
        return PasteItemHolder.INSTANCE;
    }
    
    private static class PasteItemHolder {

        private static final JMenuItem INSTANCE = new CustomPasteItem();
    }
}
