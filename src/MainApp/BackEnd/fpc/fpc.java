/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.BackEnd.fpc;

import MainApp.FrontEnd.MainFrame.Editor.CodeEditor;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author NghiaDTSE05330
 */
public class fpc {

    public void execute(File file) {
        try {
            if (CodeEditor.getInstance().getExeTemp() != null) {
                CodeEditor.getInstance().getExeTemp().delete();
                Runtime.getRuntime().exec("taskkill /F /IM " + CodeEditor.getInstance().getExeTemp().getName());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try {
            File tmpFile = File.createTempFile("fpc_", ".tmp");
            Files.copy(file.toPath(), tmpFile.toPath(), REPLACE_EXISTING);
            Runtime rt = Runtime.getRuntime();
            String[] cmdCompile = {".\\fpc\\bin\\i386-win32\\fpc.exe", tmpFile.getAbsolutePath()};
            System.out.println(cmdCompile[0] + " " + cmdCompile[1]);
            Process procCompile = rt.exec(cmdCompile);
            String path = tmpFile.getCanonicalPath().substring(0, tmpFile.getCanonicalPath().lastIndexOf(".")) + ".exe";
            String title = "\"" + tmpFile.getName() + "\"";
            String[] cmdExecute = {"cmd", "/c", "start", title, "\"" + path + "\""};
            TimeUnit.SECONDS.sleep(2);
            rt.exec(cmdExecute);

            System.out.println(cmdExecute[0] + " " + cmdExecute[1] + " " + cmdExecute[2] + " " + cmdExecute[3]);
            CodeEditor.getInstance().setExeTemp(new File(path));;
            tmpFile.delete();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
