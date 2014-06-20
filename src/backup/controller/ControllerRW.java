/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backup.controller;

import backup.interfaces.RWSetting;
import backup.model.Setting;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.apache.log4j.Logger;

/**
 *
 * @author Miguel L
 */
public class ControllerRW implements RWSetting<Setting>{
    
    private static ControllerRW controllerRW;
    private static final  Logger log=Logger.getLogger(ControllerRW.class);
    private  File file;
    
    private ControllerRW() {
        file=new File(System.getProperty("user.dir")+"/setting.set");
    }

    /**
     *
     * @return
     */
    public static ControllerRW getController(){
        if(controllerRW==null){
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
            List<Setting> as=new ArrayList<>();
            output=new ObjectOutputStream(new FileOutputStream(file));
            output.flush();
            output.writeObject(obj);
            output.close();
        } catch (FileNotFoundException ex) {
            log.error("Error en el metodo createFile()", ex);
        } catch (IOException  ex) {
            log.error("Error en el metodo createFile()", ex);
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
        Setting s = null;
        if (file.exists()) {
            try {
                input = new ObjectInputStream(new FileInputStream(file));
                s = (Setting) input.readObject();
                input.close();
                return s;
            } catch (IOException | ClassNotFoundException ex) {
                log.error("Error en el metodo createFile()", ex);
            }
        } else {
            return new Setting();
        }
        return s;
    }

    private boolean createFile() {
        if(!file.exists()){
            try {
                return file.createNewFile();
            } catch (IOException ex) {
               log.error("Error en el metodo createFile()", ex);
               return false;
            }
        }
        return true;
    }
    
    
    
    
    
}
