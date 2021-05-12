package com.mi.paquetote;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Plaga {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nombreVulgar;
	private String nombreCientifico;
	private String URL;
	@ManyToMany
	private List<SustanciaActiva> listSustanciasActivas;
	
	public Plaga() {
		
	}
	
	public Plaga(String nombreVulgar, String nombreCientifico, String URL, List<SustanciaActiva> listSustanciasActivas) {
		this.nombreVulgar=nombreVulgar;
		this.nombreCientifico = nombreCientifico;
		this.URL = URL;
		this.listSustanciasActivas = listSustanciasActivas;
	}
	
	//GETs
	public long getId() {
		return id;
	}
	
	public String getNombreVulgar() {
		return this.nombreVulgar;
	}
	public String getNombreCientifico() {
		return this.nombreCientifico;
	}
	public String getURL() {
		return this.URL;
	}
	public List<SustanciaActiva> getListSustanciasActivas() {
		return this.listSustanciasActivas;
	}
	//SETs
	public void setNombreVulgar(String nombreVulgar) {
		this.nombreVulgar = nombreVulgar;
	}
	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}
	public void setURL(String URL) {
		this.URL = URL;
	}
	public void setListSustanciasActivas(List<SustanciaActiva>listSustanciasActivas) {
		this.listSustanciasActivas = listSustanciasActivas;
	}
	
	
	
	
}
