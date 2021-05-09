package com.mi.paquetote;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EspecieRepository  extends JpaRepository<Especie, Long>{
	Especie findByNombreVulgar(String nombreVulgar);
	Especie findByNombreCientifico(String nombreCientifico);
	List<Especie> findAllByPlaga(String plaga);
}
