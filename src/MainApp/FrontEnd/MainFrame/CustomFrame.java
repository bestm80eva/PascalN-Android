/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame;

import MainApp.FrontEnd.MainFrame.Editor.CodeEditor;
import MainApp.FrontEnd.MainFrame.MenuBar.MainMenuBar;
import MainApp.FrontEnd.MainFrame.ToolBar.MainToolBar;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;
import MainApp.resource.Constant;
import com.sun.java.swing.plaf.motif.MotifLookAndFeel;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;

/**
 *
 * @author NghiaDTSE05330
 */
public class CustomFrame extends JFrame {

    public CustomFrame() {
        super();
        init();
        addComponent();

        this.pack();

    }

    private void addComponent() {
        //Add Component
        this.setJMenuBar(MainMenuBar.getInstance());
        this.add(CodeEditor.getInstance(), BorderLayout.CENTER);
        this.add(MainToolBar.getInstance(), BorderLayout.NORTH);

    }

    private void init() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setTitle(Constant.application_name);

        this.setLocationRelativeTo(null);

        try {
            UIManager.setLookAndFeel(new WindowsLookAndFeel());
            UIManager.getDefaults().put("Button.showMnemonics", Boolean.TRUE);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
