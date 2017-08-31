/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rzd.pktb.rainbow.auth;

import java.util.ArrayList;

/**
 *
 * @author vtimoshenko
 */
public class CurrentUser {
    private String logon;
    private ArrayList<String> roles;
    
    
    public String getLogon() {
        return logon;
    }

    public void setLogon(String logon) {
        this.logon = logon;
    }
}
