/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.os.Login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author rajeshs
 */
public class Logout extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static  String result = "fail";

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
        HttpSession ss = request.getSession();
            ss.setAttribute("uname",null);
            System.out.println("khjdfhk*********"+ss.getAttribute("uname"));
            ss.invalidate();
                        
            
                result="success";
                
            
        
        return mapping.findForward(result);
    }
}
