/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.BackEnd.ClientSocket;

import MainApp.BackEnd.adb.clientAdb;
import MainApp.FrontEnd.MainFrame.Editor.CodeEditor;
import MainApp.resource.Constant;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.io.FileReader;
import java.net.ConnectException;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

/**
 *
 * @author NghiaDTSE05330
 */
public class SocketThread implements Runnable {

    ClientSocket clientSock;

    @Override
    public void run() {
        try {
            int port = clientAdb.getInstance().getPort();

            clientSock = new ClientSocket();

            clientSock.socket = new Socket(Constant.con_host, port);
            clientSock.socket.setSoTimeout(5000);
        } catch (SocketException ex) {
            JOptionPane.showMessageDialog(null, Constant.cantconnect);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try {
            clientSock.os = new BufferedWriter(new OutputStreamWriter(clientSock.socket.getOutputStream()));
            //in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            clientSock.is = new BufferedReader(new InputStreamReader(clientSock.socket.getInputStream()));
            sendCommand(clientSock.os, "[EXECUTE]");

            String responseLine = clientSock.is.readLine();
            System.out.println("Server: " + responseLine);

            String file_path = responseLine + "/" + CodeEditor.getInstance().getCurrentFile().getName();
            file_path = clientAdb.getInstance().sendFile(CodeEditor.getInstance().getCurrentFile(), responseLine);
            sendCommand(clientSock.os, "[FILE_NAME]");
            sendCommand(clientSock.os, file_path);
            System.out.println("file_path:" + file_path);

            sendCommand(clientSock.os, "[DONE]");
            System.out.println("DONE");
            responseLine = clientSock.is.readLine();
            System.out.println(responseLine);
            if (responseLine.equals("[SEND_FILE_SOCKET]")) {
                sendFileThroughSocket(CodeEditor.getInstance().getCurrentFile());
            } else {
                if (responseLine.equals("OK")) {
                    clientAdb.getInstance().sendFile(CodeEditor.getInstance().getCurrentFile(), file_path);

                }
            }

            clientSock.is.close();
            clientSock.os.close();
            clientSock.socket.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, Constant.cantsenddata);
            ex.printStackTrace();

        }
    }

    private void sendFileThroughSocket(File file) {
        try {
            String fileChar;
            FileReader fileReader = new FileReader(file.getPath());
            BufferedReader bufferReader = new BufferedReader(fileReader);

            while ((fileChar = bufferReader.readLine()) != null) {
                System.out.println(fileChar);
                sendCommand(clientSock.os, fileChar);
            }

            bufferReader.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    private void sendCommand(BufferedWriter os, String cmd) {
        try {
            os.write(cmd);
            os.newLine();
            os.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
