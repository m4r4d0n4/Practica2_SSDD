package com.mi.paquetote;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
		Especie e2 = new Especie("notvul", "a", arr3);
		ArrayList<Especie> arr5 = new ArrayList<>();
		arr5.add(e2);
		arr5.add(e1);
		Especie e3 = new Especie("notnotvul", "a", arr3);
		ArrayList<Especie> arr6 = new ArrayList<>();
		arr6.add(e3);
		repEspecies.save(e2);
		repEspecies.save(e3);
		CategoriaCultivo c1 = new CategoriaCultivo("Primero", arr4);
		repCultivos.save(c1);
		CategoriaCultivo c2 = new CategoriaCultivo("Segundo", arr5);
		repCultivos.save(c2);
		CategoriaCultivo c3 = new CategoriaCultivo("Tercero	", arr6);
		repCultivos.save(c3);
	}
	//GET's listas de elementos
	@RequestMapping(value = "/categorias_cultivos", method = RequestMethod.GET)
	public List<CategoriaCultivo> getCategoriasCultivos(){
		return repCultivos.findAll();
	}
	
	@RequestMapping(value = "/categorias_cultivos/{nombre}", method = RequestMethod.GET)
	public List<Especie> getEspeciesCategoriaCultivoNombre(@PathVariable("nombre") String nombre){
		return repCultivos.findByNombre(nombre).getListaEspecies();
	}
	@RequestMapping(value = "/especies", method = RequestMethod.GET)
	public List<Especie> geEspecies(){
		return repEspecies.findAll();
	}
	
	@RequestMapping(value = "/especies/{nombre}", method = RequestMethod.GET)
	public List<Plaga> getPlagasEspecieNombre(@PathVariable("nombre") String nombre){
		return repEspecies.findBynombreVulgar(nombre).getListaPlagas();
	}
	
	@RequestMapping(value = "/productos", method = RequestMethod.GET)
	public List<Producto> getFitoProductos(){
		return repProductos.findAll();
	}
	
	@RequestMapping(value = "/plagas", method = RequestMethod.GET)
	public List<Plaga> getPlagas(){
		return repPlagas.findAll();
	}
	
	@RequestMapping(value = "/sustancias_activas", method = RequestMethod.GET)
	public List<SustanciaActiva> getSustanciasActivas(){
		return repSustancias.findAll();
	}
}
