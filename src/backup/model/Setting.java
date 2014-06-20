/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backup.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Timer;

/**
 *
 * @author Miguel L
 */
public class Setting implements Serializable{
    private static final long VersionID =1L;
    private String sourceAddress;
    private String destinationAddress;
    private LocalDate dateBackup;
    private LocalTime timerBackup;

    public String getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public LocalDate getDateBackup() {
        return dateBackup;
    }

    public void setDateBackup(LocalDate dateBackup) {
        this.dateBackup = dateBackup;
    }

    public LocalTime getTimerBackup() {
        return timerBackup;
    }

    public void setTimerBackup(LocalTime timerBackup) {
        this.timerBackup = timerBackup;
    }

    
}
