package com.infotel.TPMavenSpringNote.service;

import com.infotel.TPMavenSpringNote.metier.Formation;
import com.infotel.TPMavenSpringNote.metier.dev;

public interface Iservice {

	public int ajouterFormation (Formation f);
	public int ajouterDev (dev d);
}
