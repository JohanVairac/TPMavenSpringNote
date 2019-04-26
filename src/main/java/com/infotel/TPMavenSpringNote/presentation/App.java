package com.infotel.TPMavenSpringNote.presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.infotel.TPMavenSpringNote.metier.Formation;
import com.infotel.TPMavenSpringNote.metier.dev;
import com.infotel.TPMavenSpringNote.service.Iservice;
import com.infotel.TPMavenSpringNote.service.serviceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    
    	//SPRING COMMANDE
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
   
    	dev d =context.getBean ("dev1", dev.class);
        Iservice service= context.getBean("service", serviceImpl.class);
        
        System.out.println(d);
        service.ajouterDev(d);
        
      
        
        
    	
    
    }
    
    
}
