/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backup.controller;

import java.time.LocalDateTime;
import java.time.LocalTime;
import javax.swing.JSpinner;

/**
 *
 * @author miguel
 */
public class ControllerHour {
    private LocalTime ltime;
    private JSpinner hour,min,status;

    public ControllerHour(JSpinner hour, JSpinner min, JSpinner status) {
        this.hour = hour;
        this.min = min;
        this.status = status;
    }

    public LocalTime getLtime() {
        return ltime;
    }
    
    
}
