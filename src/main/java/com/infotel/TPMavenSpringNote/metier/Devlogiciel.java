package com.infotel.TPMavenSpringNote.metier;

public class Devlogiciel {

	private dev developpeur;
	private dev chefdeveloppeur;
	
	public dev getDeveloppeur() {
		return developpeur;
	}
	public void setDeveloppeur(dev developpeur) {
		this.developpeur = developpeur;
	}
	public dev getChefdeveloppeur() {
		return chefdeveloppeur;
	}
	public void setChefdeveloppeur(dev chefdeveloppeur) {
		this.chefdeveloppeur = chefdeveloppeur;
	}
	
	@Override
	public String toString() {
		return "Devlogiciel [developpeur=" + developpeur + ", chefdeveloppeur=" + chefdeveloppeur + "]";
	}
	
	
}
