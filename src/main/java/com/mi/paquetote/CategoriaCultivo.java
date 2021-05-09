package com.mi.paquetote;

import java.util.List;
import javax.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class CategoriaCultivo {
	@Id
	private Long id;
	private String nombre;
	@ManyToMany
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
