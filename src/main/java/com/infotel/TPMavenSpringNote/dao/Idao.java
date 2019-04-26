package com.infotel.TPMavenSpringNote.dao;

import com.infotel.TPMavenSpringNote.metier.Formation;
import com.infotel.TPMavenSpringNote.metier.dev;


public interface Idao {

	public int ajouterFormation (Formation f);
	
	public int ajouterDev(dev d);
}
