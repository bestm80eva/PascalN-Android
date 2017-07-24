/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp;

import MainApp.BackEnd.adb.adb;
import MainApp.FrontEnd.MainFrame.MainFrame;

/**
 *
 * @author NghiaDTSE05330
 */
public class main {

    public static void main(String[] args) {
        MainFrame.getInstance().setVisible(true);
        adb debug = new adb();
        debug.getMobileDevice();

    }
}
