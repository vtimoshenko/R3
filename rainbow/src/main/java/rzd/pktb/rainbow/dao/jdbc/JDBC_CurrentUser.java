/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rzd.pktb.rainbow.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import rzd.pktb.rainbow.auth.CurrentUser;
import rzd.pktb.rainbow.dao.DAO_CurrentUser;

/**
 *
 * @author vtimoshenko
 */
public class JDBC_CurrentUser extends JDBC_DAO implements DAO_CurrentUser {

    public boolean checkLogin(String login, String password) {
        try {
            Connection connection = this.ds.getConnection();
            String query = "select count(*) from security.user where LOGON=? and PASSWORD=?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.execute();
            
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(JDBC_CurrentUser.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public CurrentUser getCurrentUser(String login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
