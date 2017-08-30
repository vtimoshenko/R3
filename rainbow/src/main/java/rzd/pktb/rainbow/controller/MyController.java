package rzd.pktb.rainbow.controller;

import rzd.pktb.rainbow.manager.SessionManager;
import rzd.pktb.rainbow.manager.AppManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 * Author: Georgy Gobozov
 * Date: 10.04.13
 */
@Controller
public class MyController {

    @Resource(lookup = "java:jboss/datasources/rainbow")
    private DataSource ds;

    @Autowired
    private ApplicationContext appContext;
    /*
    @RequestMapping(value = "/action", method = RequestMethod.GET)
    public String dbGeneration(ModelMap model) {
        String result = "";
        try {
            Connection connect = ds.getConnection();
            Statement sm = connect.createStatement();
            ResultSet set = sm.executeQuery("select * from security.user");
            while(set.next()){
                result += "User:" + set.getString("LOGON") + "<BR>";
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyController.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.addAttribute("message", result);
        return "protocol";
    }
    */
    @RequestMapping(value = "/scope", method = RequestMethod.GET)
    public String scopeTest(ModelMap model) {
        String result = "";
        result += "<br>APP:" + appContext.getBean("appBean", AppManager.class).get();
        result += "<br>SESSION:" + appContext.getBean("sessBean", SessionManager.class).get();
        model.addAttribute("message", result);
        return "protocol";
    }
    
    /*
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
        model.addAttribute("message", "Spring 3 MVC Hello World");
        return "hello";
    }


    @RequestMapping(value = "/sum", method = RequestMethod.GET)
    public String goToSumpage(HttpServletRequest request, ModelMap map) {
        return "summa";
    }


    @RequestMapping(value = "/sum/{d1}/{d2}", method = RequestMethod.GET)
    public String sumRest(@PathVariable("d1") int arg1, @PathVariable("d2") int arg2, ModelMap map) {
        map.addAttribute("sum", arg1 + arg2);
        return "summa";
    }


    @RequestMapping(value = "/sum", method = RequestMethod.POST)
    public String sum(HttpServletRequest request, ModelMap map) {
        
        String d1 = request.getParameter("d1");
        String d2 = request.getParameter("d2");
        try {
            int sum = Integer.parseInt(d1) + Integer.parseInt(d2);
            map.addAttribute("sum", sum);
        } catch (Exception e) {
            map.addAttribute("error", "Arguments must be numbers!");
        }

        return "summa";
    }


    @RequestMapping(value = "/mult", method = RequestMethod.GET)
    public ModelAndView mult(ModelMap model) {
        model.addAttribute("one", 10);
        model.addAttribute("two", 20);
        return new ModelAndView("mult", "model", model);
    }
    */

}
