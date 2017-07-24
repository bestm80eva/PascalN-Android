/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.BackEnd.adb;

import MainApp.BackEnd.DataStruct.MobileDevice;
import MainApp.FrontEnd.MainFrame.ToolBar.DeviceListComboBox.DeviceListComboBox;
import MainApp.resource.Constant;
import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author NghiaDTSE05330
 */
public class adb {

    private BufferedReader stdOutput;
    private BufferedReader stdError;
    private Process proc;
    private OutputStream stdInput;
    private Runtime rt;
    private int port;

    public int getPort() {
        return port;
    }

    public adb() {
        try {
            System.out.println("ok");
            String strOut;
            rt = Runtime.getRuntime();
            String[] commands = {".\\adb\\adb.exe"};
            proc = rt.exec(commands);

            stdOutput = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            stdError = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
            stdInput = proc.getOutputStream();
            String line;

            while ((line = stdError.readLine()) != null) {
                System.out.println(line);
            }
            line = null;
            while ((line = stdOutput.readLine()) != null) {
                System.out.println(line);
            }
//            stdOutput.close();
//            stdError.close();
//            stdInput.close();

        } catch (IOException ex) {
        }

    }

    private ArrayList<String> execute(String arg, boolean getOutput) {
        System.out.println(arg);
        ArrayList<String> res = new ArrayList<String>();
        ArrayList<String> cmd = new ArrayList<String>();
        cmd.add(".\\adb\\adb.exe");
        String[] a = new String[arg.split("\\s+").length + 1];

        for (int i = 0; i < (arg.split("\\s+").length); ++i) {
            cmd.add(arg.split("\\s+")[i]);
        }
        cmd.toArray(a);

        try {
            rt = Runtime.getRuntime();
            proc = rt.exec(a);
            if (!getOutput) {
                return null;
            }
            stdOutput = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            stdError = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
            stdInput = proc.getOutputStream();
            System.out.println();
            String strOut = "";
            String line;

            while ((line = stdError.readLine()) != null) {
            }
            line = null;

            while ((line = stdOutput.readLine()) != null) {
                res.add(line);
                System.out.println(line);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return res;

    }

    public void startAbd() {
        execute("start-server", false);
    }

    public void stopAbd() {
        execute("kill-server", false);
    }

    public void createConnection(int port) {
        this.port = port;
        
        System.out.println("forward tcp:" + port + " tcp:" + port);
        execute("forward tcp:" + port + " tcp:" + port, false);
    }
    public void removeSocket(){
        execute("reverse --remove-all", false);
    }
    public String sendFile(File file, String path) {
        //getAppFolder();
        execute("push " + "\"" + file.getAbsolutePath() + "\"" + " " + "\"" + path + "/"  + "\"", false);
        return path + "/" + file.getName();
    }

    public ArrayList<MobileDevice> getMobileDevice() {
        ArrayList<MobileDevice> listDevice = new ArrayList<MobileDevice>();
        ArrayList<String> respond = new ArrayList<String>();
        respond = execute("devices -l", true);

        String id, product, model, device;
        for (int i = 0; i < respond.size(); ++i) {
            if (respond.get(i).indexOf("device product") > 0) {
                MobileDevice md = new MobileDevice();
                String[] array = respond.get(i).split("\\s+");
                id = array[0];
                System.out.println(id);
                product = array[2];
                System.out.println(product);
                model = array[3];
                System.out.println(model);
                device = array[4];
                System.out.println(device);
                System.out.println("");
                System.out.println("");

                md.id = id;
                md.product = product.substring(product.indexOf("product:") + 8);
                md.model = model.substring(model.indexOf("model:") + 6);
                md.device = device.substring(device.indexOf("device:") + 7);
                listDevice.add(md);
            }
        }
        System.out.println(respond.size());

        return listDevice;
    }
    public void refresh(){
        
        int oldSelect=DeviceListComboBox.getInstance().getSelectedIndex();
        System.out.println("Connection Created");
        ArrayList<MobileDevice> deviceList = new ArrayList<MobileDevice>();
        deviceList = clientAdb.getInstance().getMobileDevice();
        DeviceListComboBox.getInstance().getDeviceList().removeAllElements();
        try {
            DeviceListComboBox.getInstance().getDeviceList().addElement(InetAddress.getLocalHost().getHostName());
        } catch (UnknownHostException ex) {
            System.out.println("Hostname can not be resolved");
        }
        for (int i = 0; i < deviceList.size(); ++i) {

            DeviceListComboBox.getInstance().getDeviceList().addElement("[" + deviceList.get(i).id + "]" + " " + deviceList.get(i).model);
        }
        if (DeviceListComboBox.getInstance().getDeviceList().getSize()>oldSelect){
             DeviceListComboBox.getInstance().setSelectedIndex(oldSelect);
        }
       

    }

}
