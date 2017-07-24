/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.BackEnd.adb;

/**
 *
 * @author NghiaDTSE05330
 */
public class clientAdb {

    private clientAdb() {
    }

    public static adb getInstance() {
        return clientAdbHolder.INSTANCE;
    }

    private static class clientAdbHolder {

        private static final adb INSTANCE = new adb();
    }
}
