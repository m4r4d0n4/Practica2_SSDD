package com.mi.paquetote;

import java.util.List;

import javax.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class Producto {
	@Id
	private long id;
	private String nombre;
	private String URL;
	@ManyToMany(mappedBy="listFitoProds")
	private List<Producto> listaProductos;
	
	public Producto (String n, String u) {
		nombre = n;
		URL = u;
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
