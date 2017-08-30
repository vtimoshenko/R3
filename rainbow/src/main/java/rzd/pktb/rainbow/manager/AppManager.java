/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rzd.pktb.rainbow.manager;

import java.util.Date;
import org.springframework.stereotype.Component;

/**
 *
 * @author vtimoshenko
 */
public class AppManager {
    private Date StartDate;
    private int RandId;

    public AppManager() {
        this.StartDate = new Date();
        RandId = (int)Math.random()*1000;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public int getRandId() {
        return RandId;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

    public void setRandId(int RandId) {
        this.RandId = RandId;
    }
    
    public String get() {
        return StartDate + ":" + RandId;
    }
}
