/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backup.controller;

import com.sun.corba.se.impl.io.IIOPOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import backup.interfaces.RWSetting;
import backup.model.Setting;

/**
 *
 * @author Miguel L
 */
public class ControllerRW implements RWSetting<Setting>{
    
    private static ControllerRW controllerRW;
    
    private ControllerRW() {
    }

    /**
     *
     * @return
     */
    public static ControllerRW getController(){
        if(controllerRW!=null){
            return new ControllerRW();
        }else{
            return controllerRW;
        }
    }
    
    /**
     * 
     * @param obj
     * @return boolean 
     */
    @Override
    public boolean save(Setting obj) {
//        OutputStream out=new 
////        ObjectOutputStream output=new ObjectOutputStream(null);
        
        return true;
    }

    /**
     * 
     * @return Setting
     */
    @Override
    public Setting getSetting() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
