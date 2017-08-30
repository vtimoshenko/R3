/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rzd.pktb.rainbow.auth;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 *
 * @author vtimoshenko
 */
@WebServlet(name = "Authorization", urlPatterns = {"/Authorization"})
public class S_Authorization extends HttpServlet {

    @Resource(lookup = "java:jboss/datasources/rainbow")
    private DataSource ds;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException {
        doGet(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException {
        String username = request.getParameter("j_username");
        String password = request.getParameter("j_password");
        
        
        
    }
    
    private void checkAuth(String username, String password){
        try {
            Connection connection = ds.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(S_Authorization.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
