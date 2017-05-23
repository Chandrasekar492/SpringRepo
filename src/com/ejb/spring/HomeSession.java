package com.ejb.spring;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class HomeSession
 */
@Stateless

public class HomeSession {

    /**
     * Default constructor. 
     */
    public HomeSession() {
        // TODO Auto-generated constructor stub
    }
    
    public String getHome(){
    	
    	return "From EJB";
    }

}
