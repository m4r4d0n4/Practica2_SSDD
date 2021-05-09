package com.mi.paquetote;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {
	@Autowired
	private EspecieRepository repEspecies;
	@Autowired
	private CategoriaCultivoRepository repCultivos;
	@Autowired
	private SustanciaActivaRepository repSustancias;
	@Autowired
	private PlagaRepository repPlagas;
	@Autowired
	private ProductoRepository repProductos;
	@Autowired
	
	@PostConstruct
	public void init() {
		Producto p1 = new Producto("Meh", "url");
		repProductos.save(p1);
		Producto p2 = new Producto("Peh", "uri");
		repProductos.save(p2);
		ArrayList<Producto> arr1 = new ArrayList<>();
		arr1.add(p1);
		arr1.add(p2);
		SustanciaActiva s1 = new SustanciaActiva("Sus1", arr1);
		repSustancias.save(s1);
		ArrayList<SustanciaActiva> arr2 = new ArrayList<>();
		arr2.add(s1);
		Plaga pl1 = new Plaga("mosca", "mosca 100cia", "url", arr2);
		repPlagas.save(pl1);
		ArrayList<Plaga> arr3 = new ArrayList<>();
		arr3.add(pl1);
		Especie e1 = new Especie("vul", "100cia", arr3);
		repEspecies.save(e1);	
		ArrayList<Especie> arr4 = new ArrayList<>();
		arr4.add(e1);
		CategoriaCultivo c1 = new CategoriaCultivo("n", arr4);
		repCultivos.save(c1);
	}
}
