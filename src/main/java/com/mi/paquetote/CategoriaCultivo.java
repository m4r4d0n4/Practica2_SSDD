package com.mi.paquetote;

import java.util.List;

public class CategoriaCultivo {
	private String nombre;
	private List<Especie> listaEspecies;
	
	public CategoriaCultivo(String n) {
		nombre = n;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public List<Especie> listaEspecies () {
		return listaEspecies;
	}
	
}
