package com.infotel.TPMavenSpringNote.dao;
import org.springframework.stereotype.Repository;

import com.infotel.TPMavenSpringNote.dao.Idao;
import com.infotel.TPMavenSpringNote.metier.Formation;
import com.infotel.TPMavenSpringNote.metier.dev;

@Repository
public class daoImpl implements Idao {

	@Override
	public int ajouterFormation (Formation f) {
		
		System.out.println("La formation a été ajoutée");
		return f.getIdFormation();
	}

	
	@Override
	public int ajouterDev(dev d) {
		// TODO Auto-generated method stub
		return d.getExperience();
	}

}
