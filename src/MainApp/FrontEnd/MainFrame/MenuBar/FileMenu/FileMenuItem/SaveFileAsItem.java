/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.MenuBar.FileMenu.FileMenuItem;

import MainApp.FrontEnd.MainFrame.MenuBar.FileMenu.FileMenuItem.CustomFileMenuItem.CustomSaveFileAsItem;
import javax.swing.JMenuItem;

/**
 *
 * @author NghiaDTSE05330
 */
public class SaveFileAsItem {
    
    private SaveFileAsItem() {
    }
    
    public static JMenuItem getInstance() {
        return SaveFileAsItemHolder.INSTANCE;
    }
    
    private static class SaveFileAsItemHolder {

        private static final JMenuItem INSTANCE = new CustomSaveFileAsItem();
    }
}
