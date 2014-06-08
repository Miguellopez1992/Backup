/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backup;

import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import sun.awt.AWTAccessor;

/**
 *
 * @author miguel
 */
public class ViewBarTask {

    public ViewBarTask() {
        ini();
    }

    private void ini() {

    }
    
    private SystemTray barTask;
    private TrayIcon iconTask;
    private PopupMenu pMenu;
    private MenuItem exitItem;
    private MenuItem aboutItem;
    private MenuItem openItem;
    
    
}
