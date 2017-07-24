/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.BackEnd.FileChooser.OpenFileChooser;

import MainApp.BackEnd.FileChooser.SaveFileChooser.*;

/**
 *
 * @author NghiaDTSE05330
 */
public class SingletonOpenFileChooser {

    private SingletonOpenFileChooser() {
    }

    public static OpenFileChooser getInstance() {
        return SingletonSaveFileChooserHolder.INSTANCE;
    }

    private static class SingletonSaveFileChooserHolder {

        private static final OpenFileChooser INSTANCE = new OpenFileChooser();
    }
}
