/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.BackEnd.fpc;

/**
 *
 * @author NghiaDTSE05330
 */
public class clientFpc {
    
    private clientFpc() {
    }
    
    public static fpc getInstance() {
        return clientFpcHolder.INSTANCE;
    }
    
    private static class clientFpcHolder {

        private static final fpc INSTANCE = new fpc();
    }
}
