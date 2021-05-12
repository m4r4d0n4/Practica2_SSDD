package com.mi.paquetote;

import java.util.List;
import javax.persistence.*;

@Entity
public class CategoriaCultivo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nombre;
	@ManyToMany
	private List<Especie> listaEspecies;
	
	public CategoriaCultivo() {}
	
	public CategoriaCultivo(String n, List<Especie> ls) {
		nombre = n;
		this.listaEspecies = ls;
	}
	
	public long getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public List<Especie> getListaEspecies () {
		return listaEspecies;
	}
	
}
