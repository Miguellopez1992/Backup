/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backup;

import java.awt.AWTException;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.ref.WeakReference;
import javax.swing.ImageIcon;
import org.apache.log4j.Logger;

/**
 *
 * @author miguel
 */
public class ViewBarTask {
    
    private static final Logger log=Logger.getLogger(ViewBarTask.class);
    
    public ViewBarTask() {
        ini();
        
    }

    private void ini(){
        barTask=SystemTray.getSystemTray();
        aboutW=new WeakReference(about);
        viewW=new WeakReference(view);
        view=new View();
        about=new About(null, true);
        iconTask=new TrayIcon(new ImageIcon(getClass().getResource("/backup/image/backup.png").toString()).getImage());
        pMenu=new PopupMenu("Backup Menu");
        exitItem = new MenuItem("Exit");
        aboutItem = new MenuItem("About");
        openItem = new MenuItem("Open");
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitItemAction();
            }
        });
        aboutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aboutItemAction();
            }
        });
        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opentItemAction();
            }
        });
        iconTask.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                iconTaskClicked();
            }
        });
        pMenu.add(exitItem);
        pMenu.add(aboutItem);
        pMenu.add(openItem);
        iconTask.setPopupMenu(pMenu);
        try {
            barTask.add(iconTask);
        } catch (AWTException ex) {
            log.error(ex);
        }
        
        
    }
    
    


    private void exitItemAction() {
        System.exit(0);
    }
    private void aboutItemAction() {
        about.setVisible(true);
    }
    
    private void opentItemAction() {
        view.setVisible(true);
    }

    private void iconTaskClicked() {
        view.setVisible(true);
    }

    private SystemTray barTask;
    private TrayIcon iconTask;
    private PopupMenu pMenu;
    private MenuItem exitItem;
    private MenuItem aboutItem;
    private MenuItem openItem;
    private About about;
    private View view;
    private WeakReference<About> aboutW;
    private WeakReference<View> viewW;
            
}
