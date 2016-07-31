package ejbclient;

import com.EJBexample.SessionBeanRemote;
import javax.ejb.EJB;

public class Main {

    @EJB
    private static SessionBeanRemote sessionBean;

    public static void main(String[] args) {
        System.err.println("output = " + sessionBean.HelloWorld());
    }
}
