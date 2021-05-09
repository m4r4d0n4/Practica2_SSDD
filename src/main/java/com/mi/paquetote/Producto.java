package com.mi.paquetote;

public class Producto {
	private String nombre;
	private String URL;
	
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
