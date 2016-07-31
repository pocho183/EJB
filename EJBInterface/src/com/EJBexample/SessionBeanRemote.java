package com.EJBexample;

import javax.ejb.Remote;

@Remote
public interface SessionBeanRemote {

    String HelloWorld();
    
}
