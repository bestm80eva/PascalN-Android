/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.ToolBar;

import MainApp.FrontEnd.MainFrame.MainFrame;
import MainApp.FrontEnd.MainFrame.ToolBar.DeviceListComboBox.DeviceListComboBox;
import MainApp.FrontEnd.MainFrame.ToolBar.ToolBarButton.*;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JToolBar;

/**
 *
 * @author NghiaDTSE05330
 */
public class CustomToolBar extends JToolBar {

    public CustomToolBar() {
        super();
        this.setOrientation(HORIZONTAL);

        this.add(NewFileButton.getInstance());
        this.add(OpenFileButton.getInstance());
        this.add(SaveFileButton.getInstance());
        this.addSeparator();

        this.add(UndoButton.getInstance());
        this.add(RedoButton.getInstance());
        this.addSeparator();

        this.add(DeviceListComboBox.getInstance());
        this.addSeparator();
        this.add(RefreshDeviceButton.getInstance());
        this.addSeparator();

        this.add(RunFileButton.getInstance());
        this.add(StopButton.getInstance());

    }

}
