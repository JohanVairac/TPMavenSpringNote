package com.infotel.TPMavenSpringNote.service;

import org.springframework.stereotype.Service;

import com.infotel.TPMavenSpringNote.dao.Idao;
import com.infotel.TPMavenSpringNote.metier.Formation;
import com.infotel.TPMavenSpringNote.metier.dev;

@Service ("service")
public class serviceImpl implements Iservice {

private Idao dao;
	@Override
	public int ajouterFormation(Formation f) {
		
		return dao.ajouterFormation(f);
	}
	
	@Override
	public int ajouterDev(dev d) {
		// TODO Auto-generated method stub
		return 0;
	}

}
