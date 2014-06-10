/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backup;

import java.awt.EventQueue;
import org.apache.log4j.Logger;

/**
 *
 * @author Miguel L
 */
public class Backup {
    private static final Logger log=Logger.getLogger(Backup.class);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(()  -> {
            ViewBarTask viewBarTask = new ViewBarTask();
        });
    }


    
}
