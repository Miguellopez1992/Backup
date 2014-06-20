/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backup.controller;

import backup.View;
import backup.model.Setting;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author Miguel L
 */
public class ControllerView {
    private View view;
    private Setting setting;
    private ControllerRW crw;

    public ControllerView() {
        load();
    }
    
    public ControllerView(View view) {
        load();
        this.view = view;
    }
    
    private void load(){
        this.crw=ControllerRW.getController();
        this.setting=crw.getSetting();
    }
    
    public void loadView(){
        this.view.getjFileChooser1().setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        this.view.getjTextField1().setText(setting.getSourceAddress());
        this.view.getjTextField2().setText(setting.getDestinationAddress());
    }
    
    public void viewsource(){
        if(setting.getSourceAddress()!=null)
            view.getjFileChooser1().setSelectedFile(new File(setting.getSourceAddress()));
        if(view.getjFileChooser1().showSaveDialog(view)==JFileChooser.APPROVE_OPTION){
            view.getjTextField1().setText(view.getjFileChooser1().getSelectedFile().getAbsolutePath());
        }
    }
    
    public void viewDestination(){
        if(setting.getDestinationAddress()!=null)
            view.getjFileChooser1().setSelectedFile(new File(setting.getDestinationAddress()));
        if(view.getjFileChooser1().showSaveDialog(view)==JFileChooser.APPROVE_OPTION){
            view.getjTextField2().setText(view.getjFileChooser1().getSelectedFile().getAbsolutePath());
        }
    }

}
