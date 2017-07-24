/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.MenuBar.FileMenu.FileMenuItem;

import MainApp.FrontEnd.MainFrame.MenuBar.FileMenu.FileMenuItem.CustomFileMenuItem.CustomOpenFileItem;
import javax.swing.JMenuItem;

/**
 *
 * @author NghiaDTSE05330
 */
public class OpenFileItem {
    
    private OpenFileItem() {
    }
    
    public static  JMenuItem getInstance() {
        return OpenFileItemHolder.INSTANCE;
    }
    
    private static class OpenFileItemHolder {

        private static final JMenuItem INSTANCE = new CustomOpenFileItem();
    }
}
