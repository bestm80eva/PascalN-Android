/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.Editor;

import MainApp.FrontEnd.MainFrame.Editor.DefaultEditor;
import javax.swing.JComponent;

/**
 *
 * @author NghiaDTSE05330
 */
public class CodeEditor {

    private CodeEditor() {
    }

    public static DefaultEditor getInstance() {
        return CodeEditorHolder.INSTANCE;
    }

    private static class CodeEditorHolder {

        private static final DefaultEditor INSTANCE = (DefaultEditor) new DefaultEditor();
    }
}
