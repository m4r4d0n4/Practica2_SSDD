package com.mi.paquetote;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaCultivoRepository extends JpaRepository<CategoriaCultivo, Long>{
	public CategoriaCultivo findByNombre(String n);
}
