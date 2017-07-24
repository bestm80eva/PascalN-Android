/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.Editor.EditorTextArea;

import MainApp.BackEnd.Utils.ImageUtils;
import MainApp.BackEnd.Utils.UndoButtonUtils;
import MainApp.FrontEnd.MainFrame.ToolBar.ToolBarButton.RedoButton;
import MainApp.FrontEnd.MainFrame.ToolBar.ToolBarButton.UndoButton;
import MainApp.resource.Constant;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.Document;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;

/**
 *
 * @author NghiaDTSE05330
 */
public class CustomTextArea extends RSyntaxTextArea {

    final private UndoManager codeEditorUndoManager = new UndoManager();

    public UndoManager getCodeEditorUndoManager() {
        return codeEditorUndoManager;
    }
    private Document doc;

    public CustomTextArea() {

        super(20, 60);
        doc = this.getDocument();
        doc.addUndoableEditListener(new UndoableEditListener() {
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                codeEditorUndoManager.addEdit(e.getEdit());
                UndoButtonUtils.reloadIcon();
            }

        });
        this.setFont(this.getFont().deriveFont(24f));

        this.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_DELPHI);
        this.setCodeFoldingEnabled(true);
        this.setHighlightCurrentLine(true);
        this.setLineWrap(true);

        this.getActionMap().put("Undo",
                new AbstractAction("Undo") {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (codeEditorUndoManager.canUndo()) {
                        codeEditorUndoManager.undo();
                        UndoButtonUtils.reloadIcon();
                    }
                    UndoButtonUtils.reloadIcon();
                } catch (CannotUndoException ex) {

                }
            }
        });
        this.getInputMap().put(KeyStroke.getKeyStroke("control Z"), "Undo");

        this.getActionMap().put("Redo",
                new AbstractAction("Redo") {
            public void actionPerformed(ActionEvent evt) {
                try {
                    if (codeEditorUndoManager.canRedo()) {
                        codeEditorUndoManager.redo();
                        UndoButtonUtils.reloadIcon();
                    }
                    UndoButtonUtils.reloadIcon();

                } catch (CannotRedoException ex) {
                }
            }
        });
        this.getInputMap().put(KeyStroke.getKeyStroke("control Y"), "Redo");

    }

}
