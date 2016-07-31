package com.EJBexample;

import javax.ejb.Stateless;

@Stateless
public class SessionBean implements SessionBeanRemote {

    
    public String HelloWorld() {
        return "Hello EJB World !!! ";
    }

}
