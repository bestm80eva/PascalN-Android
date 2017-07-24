/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.BackEnd.fpc;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.ArrayList;

/**
 *
 * @author NghiaDTSE05330
 */
public class fpc {
    public void execute(File file){
        try{
            File tmpFile=File.createTempFile("fpc_", ".tmp",new File(".\\fpc\\bin"));
            Files.copy(file.toPath(), tmpFile.toPath(),REPLACE_EXISTING);
            Runtime rt = Runtime.getRuntime();
            String[] cmdCompile ={".\\fpc\\bin\\fpc.exe",tmpFile.getAbsolutePath()};
            System.out.println(cmdCompile[0]+cmdCompile[1]);
            String cmdExecute =tmpFile.getAbsolutePath();
            System.out.println(cmdExecute);
            Process proc = rt.exec(cmdExecute);
        } catch (IOException ex){
            ex.printStackTrace();
        }
        
    }
    
}
