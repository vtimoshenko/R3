/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rzd.pktb.rainbow.manager;

import rzd.pktb.rainbow.dao.DAOFactory;
import rzd.pktb.rainbow.dao.DAO_CurrentUser;
import rzd.pktb.rainbow.dao.jdbc.JDBC_CurrentUser;

/**
 *
 * @author vtimoshenko
 */
public class DAO implements DAOFactory {

    private DAO_CurrentUser dao_CurrentUser;
    
    public DAO(){
        dao_CurrentUser = new JDBC_CurrentUser();
        
    }
    
    public DAO_CurrentUser getDAO_CurrentUser() {
        return dao_CurrentUser;
    }
    
}
