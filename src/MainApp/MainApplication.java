package MainApp;

import MainApp.FrontEnd.MainFrame.MainFrame;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NghiaDTSE05330
 */
public class MainApplication {

    private MainApplication() {
    }

    public static MainApplication getInstance() {
        return MainFrame1Holder.INSTANCE;
    }

    private static class MainFrame1Holder {

        private static final MainApplication INSTANCE = new MainApplication();
    }
}
