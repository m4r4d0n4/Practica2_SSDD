package com.mi.paquetote;

import java.util.List;

import javax.persistence.*;

@Entity
public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nombre;
	private String URL;
	@ManyToMany
	private List<Producto> listaProductos;
	
	public Producto() {
		
	}
	
	public Producto (String n, String u) {
		nombre = n;
		URL = u;
	}
	
	public long getId() {
		return id;
	}
	
	public void setNombre (String n) {
		nombre = n;
	}
	
	public void setURL (String u) {
		URL = u;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getURL() {
		return URL;
	}
	
}
