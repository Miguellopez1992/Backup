/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backup.model;

import java.io.Serializable;
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
    private Date dateBackup;
    private Timer timerBackup;

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

    public Date getDateBackup() {
        return dateBackup;
    }

    public void setDateBackup(Date dateBackup) {
        this.dateBackup = dateBackup;
    }

    public Timer getTimerBackup() {
        return timerBackup;
    }

    public void setTimerBackup(Timer timerBackup) {
        this.timerBackup = timerBackup;
    }
}
