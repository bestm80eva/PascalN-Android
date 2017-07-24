/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.Editor;

import MainApp.BackEnd.FileChooser.OpenFileChooser.OpenFileChooser;
import MainApp.BackEnd.FileChooser.OpenFileChooser.SingletonOpenFileChooser;
import MainApp.BackEnd.FileChooser.SaveFileChooser.SaveFileChooser;
import MainApp.BackEnd.FileChooser.SaveFileChooser.SingletonSaveFileChooser;
import MainApp.BackEnd.Interface.EditorInterface.LoadableEditor;
import MainApp.BackEnd.Interface.EditorInterface.SaveableEditor;
import MainApp.FrontEnd.MainFrame.Editor.EditorTextArea.TextArea;
import MainApp.resource.Constant;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import org.fife.ui.rtextarea.*;
import org.fife.ui.rsyntaxtextarea.*;

/**
 *
 * @author NghiaDTSE05330
 */
public class DefaultEditor extends RTextScrollPane implements SaveableEditor, LoadableEditor {

    private File currentFile;

    public File getCurrentFile() {
        return currentFile;
    }

    private File exeTemp;

    public File getExeTemp() {
        return exeTemp;
    }

    public void setExeTemp(File exeTemp) {
        this.exeTemp = exeTemp;
    }

    public DefaultEditor() {
        super(TextArea.getInstance());
        try {
            currentFile = File.createTempFile("untitle", ".tmp");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public void setCurrentFile(File currentFile) {
        this.currentFile = currentFile;
    }

    public void newFile() {

        System.out.println("OK");
        if (CodeEditor.getInstance().getTextArea().getText().length() <= 0) {
            return;
        }
        int dialogResult = JOptionPane.showConfirmDialog(null,
                Constant.alertdlg_savefile_text,
                Constant.alertdlg_savefile_title,
                JOptionPane.YES_NO_CANCEL_OPTION);;
        if (dialogResult == JOptionPane.YES_OPTION) {
            SaveFileChooser fc = SingletonSaveFileChooser.getInstance();

            int returnVal = fc.showOpenDialog(this);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                if (!file.getName().endsWith(".pas")) {
                    file = new File(file.getAbsolutePath() + ".pas");
                }
                MainApp.FrontEnd.MainFrame.MainFrame.getInstance().setTitle(Constant.untitle);
                fc.setCurrentDirectory(file);
                CodeEditor.getInstance().saveToFile(file);
                CodeEditor.getInstance().getTextArea().setText(Constant.nullString);
            }

        } else if (dialogResult == JOptionPane.NO_OPTION) {

            try {
                CodeEditor.getInstance().setCurrentFile(File.createTempFile("untitle", ".tmp"));
                CodeEditor.getInstance().getTextArea().setText(Constant.nullString);
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }

    }

    public void openFile() {
        OpenFileChooser fc = SingletonOpenFileChooser.getInstance();

        int returnVal = fc.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            CodeEditor.getInstance().loadFromFile(file);
            MainApp.FrontEnd.MainFrame.MainFrame.getInstance().setTitle(file.getName());
            fc.setCurrentDirectory(file);
        }
    }

    public void saveFile() {
        if (currentFile.getName().endsWith(".pas")) {
            saveToFile(currentFile);
        } else {
            File file = chooseFile();
            if (file != null) {
                saveToFile(file);
            }

        }
    }

    public File chooseFile() {
        File file = null;
        SaveFileChooser fc = SingletonSaveFileChooser.getInstance();

        int returnVal = fc.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
            if (!file.getName().endsWith(".pas")) {
                file = new File(file.getAbsolutePath() + ".pas");
            }
            MainApp.FrontEnd.MainFrame.MainFrame.getInstance().setTitle(file.getName());
            fc.setCurrentDirectory(file);

        }
        return file;
    }

    public void saveAs() {
        File file = chooseFile();
        if (file != null) {
            saveToFile(file);
        }
    }

    @Override
    public void saveToFile(File file) {
        if (file.exists()) {
            try (
                    PrintWriter out = new PrintWriter(file)) {
                out.println(this.getTextArea().getText());
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        } else {
            try {
                file.createNewFile();
                currentFile = file;
            } catch (IOException ex) {
            }
            saveToFile(file);
            currentFile = file;
        }

    }

    @Override
    public void loadFromFile(File file) {
        try {
            FileReader reader = new FileReader(file);
            BufferedReader bfReader = new BufferedReader(reader);
            this.getTextArea().read(bfReader, null);
            bfReader.close();
            this.getTextArea().requestFocus();
            currentFile = file;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
