package com.mi.ssddpr2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long>{
	//List<Producto> findAll();
}
