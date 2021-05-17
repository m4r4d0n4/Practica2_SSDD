package com.mi.ssddpr2;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Especie{
	//ManyToMany unidireccional (Cultivo --> Especie)
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nombreVulgar;
	private String nombreCientifico;
	//ManyToMany unidireccional (Especie --> Plaga)
	@ManyToMany
	private List<Plaga> listPlagas;
	
	public Especie() {
		
	}
	
	public Especie(String nv, String nc, List<Plaga> ls) {
		this.nombreVulgar = nv;
		this.nombreCientifico = nc;
		this.listPlagas = ls;
	}
	//Prueba 1
	
	public long getId() {
		return id;
	}
	
	public void setNombreVulgar(String nv) {
		this.nombreVulgar = nv;
	}
	
	public void setNombreCinetifico(String nc) {
		this.nombreCientifico = nc;
	}
	
	public void setListPlagas(List<Plaga> ls) {
		this.listPlagas = ls;	
	}
	
	public String getNombreVulgar() {
		return this.nombreVulgar;
	}
	
	public String getNombreCientifico() {
		return this.nombreCientifico;
	}
	
	public List<Plaga> getListaPlagas(){
		return this.listPlagas;
	}
}
