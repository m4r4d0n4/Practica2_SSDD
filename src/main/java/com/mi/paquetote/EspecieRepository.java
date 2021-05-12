package com.mi.paquetote;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EspecieRepository  extends JpaRepository<Especie, Long>{
	public Especie findBynombreVulgar(String n);
}
