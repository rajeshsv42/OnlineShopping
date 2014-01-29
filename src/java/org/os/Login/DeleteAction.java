/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.os.Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.os.Database.DBSant;

/**
 *
 * @author rajeshs
 */
public class DeleteAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static  String SUCCESS = "fail";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        try {
            String pid[] = request.getParameterValues("product_id");
           for(int i=0;i<pid.length;i++)
           {
               System.out.println("*****************"+pid[i]);
           }

            Connection connection = DBSant.oracleConnection();
            System.out.println("connection object in basket page*************" + connection);
            HttpSession ss = request.getSession();
            ResultSet rs;    
            if (pid.length > 0) {
                for (int i = 0; i < pid.length; i++) {
                    PreparedStatement preparedStatement = connection.prepareStatement("delete from basket where product_id=? and username=?");

                    preparedStatement.setString(1, pid[i]);
                    preparedStatement.setString(2, ss.getAttribute("uname").toString());
                    
                     rs = preparedStatement.executeQuery();
                        
                        connection.commit();
                    }
                               
                           SUCCESS = "success";
                        
        
                }
            }
          
        

         catch (Exception ex) {
            System.out.println("No database found");

        }




        return mapping.findForward(SUCCESS);
    }
}
