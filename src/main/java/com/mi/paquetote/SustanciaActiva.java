package com.mi.paquetote;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class SustanciaActiva {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nombre;
	@ManyToMany
	private List<Producto> listFitoProds;
	
	
	public SustanciaActiva() {}
	
	public SustanciaActiva(String nombre, List<Producto> ls) {
		this.nombre = nombre;
		this.listFitoProds = ls;
	}
	
	public long getId() {
		return id;
	}
	
	public void setNombre(String n) {
		this.nombre = n;
	}
	
	public void setListFitoProds(List<Producto> ls) {
		this.listFitoProds = ls;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public List<Producto> getListFitoProds(){
		return this.listFitoProds;
	}
}
