/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rzd.pktb.rainbow.dao.jdbc;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 *
 * @author vtimoshenko
 */
public class JDBC_DAO {
    @Resource(lookup = "java:jboss/datasources/rainbow")
    protected DataSource ds;
}
