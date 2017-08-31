/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rzd.pktb.rainbow.dao;

import rzd.pktb.rainbow.auth.CurrentUser;

/**
 *
 * @author vtimoshenko
 */
public interface DAO_CurrentUser {
    public boolean checkLogin(String login, String password);
    public CurrentUser getCurrentUser(String login);
}
