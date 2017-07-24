/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame;

import javax.swing.JFrame;

/**
 *
 * @author NghiaDTSE05330
 */
public class MainFrame extends JFrame {

    private MainFrame() {
    }

    public static JFrame getInstance() {
        return MainFrame1Holder.INSTANCE;
    }

    private static class MainFrame1Holder {

        private static final JFrame INSTANCE = new CustomFrame();
    }
}
