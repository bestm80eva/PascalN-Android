/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.BackEnd.DataStruct;

/**
 *
 * @author NghiaDTSE05330
 */
public class MobileDevice {

    public String id;
    public String product;
    public String model;
    public String device;

    @Override
    public String toString() {
        return id + '|' + product + '|' + model + '|' + device;
    }

}
