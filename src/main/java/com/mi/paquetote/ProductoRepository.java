package com.mi.paquetote;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long>{
	List<Producto> findAll();
}
