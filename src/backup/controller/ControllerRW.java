/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backup.controller;

import backup.interfaces.RWSetting;
import backup.model.Setting;
import com.sun.corba.se.impl.io.IIOPOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miguel L
 */
public class ControllerRW implements RWSetting<Setting>{
    
    private static ControllerRW controllerRW;
    private  File file;
    
    private ControllerRW() {
        file=new File(System.getProperty("user.dir")+"/setting.set");
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
        createFile();
        ObjectOutputStream output;
        try {
            output=new ObjectOutputStream(new FileOutputStream(file));
            output.flush();
            output.writeObject(obj);
            output.close();
        } catch (FileNotFoundException ex) {
            //Logger
        } catch (IOException  ex) {
            //Logger
        }
        return true;
    }

    /**
     * 
     * @return Setting
     */
    @Override
    public Setting getSetting() {
        ObjectInputStream input;
        Setting s;
        try {
            input = new ObjectInputStream(new FileInputStream(file));
            s=(Setting) input.readObject();
            input.close();
            return s;
        } catch (IOException | ClassNotFoundException ex) {
            //Logger
        }
        return null;
    }

    private boolean createFile() {
        if(!file.exists()){
            try {
                return file.createNewFile();
            } catch (IOException ex) {
               //Logger
               return false;
            }
        }
        return true;
    }
    
    
    
    
    
}
