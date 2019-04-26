package com.infotel.TPMavenSpringNote.metier;

import java.util.List;

import org.springframework.stereotype.Component;


@Autowired
public class Formation {

	private int idFormation;
	private String NomFormation;
	
	private List<Etudiant> etudiant;

	public int getIdFormation() {
		return idFormation;
	}

	public void setIdFormation(int idFormation) {
		this.idFormation = idFormation;
	}

	public String getNomFormation() {
		return NomFormation;
	}

	public void setNomFormation(String nomFormation) {
		NomFormation = nomFormation;
	}

	public List<Etudiant> getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(List<Etudiant> etudiant) {
		this.etudiant = etudiant;
	}

	@Override
	public String toString() {
		return "Formation [idFormation=" + idFormation + ", NomFormation=" + NomFormation + ", etudiant=" + etudiant
				+ "]";
	}
	
	
	
}
