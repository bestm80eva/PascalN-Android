/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.Editor.EditorTextArea;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;

/**
 *
 * @author NghiaDTSE05330
 */
public class TextArea {

    private TextArea() {
    }

    public static RSyntaxTextArea getInstance() {
        return TextAreaHolder.INSTANCE;
    }

    private static class TextAreaHolder {

        private static final RSyntaxTextArea INSTANCE = new CustomTextArea();
    }
}
