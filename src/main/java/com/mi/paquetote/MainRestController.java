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
		Producto p1 = new Producto("Microthiol", "urlMicrothiol");
		repProductos.save(p1);
		Producto p2 = new Producto("Cobre Nordox 50", "urlCobreNordox");
		repProductos.save(p2);
		Producto p3 = new Producto("Deccosol-Mf", "urlDeccosol");
		repProductos.save(p3);
		Producto p4 = new Producto("Basagran-L", "urlBasagran");
		repProductos.save(p4);
		Producto p5 = new Producto("SP4OK", "urlSP4OK");
		repProductos.save(p5);
		Producto p6 = new Producto("Microtox", "urlMicrotox");
		repProductos.save(p6);
		Producto p7 = new Producto("Ever Transparente", "urlEver");
		repProductos.save(p7);
		Producto p8 = new Producto("Nufo-Z", "urlNufo");
		repProductos.save(p8);
		Producto p9 = new Producto("Banvel-D", "urlBanvel");
		repProductos.save(p9);
		Producto p10 = new Producto("Quilan", "urlQuilan");
		repProductos.save(p10);
		Producto p11 = new Producto("Venzar", "urlVenzar");
		repProductos.save(p11);
		Producto p12 = new Producto("Vydate 10g", "urlVydate");
		repProductos.save(p12);
		Producto p13 = new Producto("Beltasur-500", "urlBeltasur");
		repProductos.save(p13);
		Producto p14 = new Producto("Captana", "urlCaptana");
		repProductos.save(p14);
		Producto p15 = new Producto("Caldo Bordeles Mac 80", "urlCaldo");
		repProductos.save(p15);
		Producto p16 = new Producto("Fulmit Oleo L.E.", "urlFulmitOleo");
		repProductos.save(p16);
		Producto p17 = new Producto("Fulmit", "urlFulmit");
		repProductos.save(p17);
		Producto p18 = new Producto("Aphox", "urlAphox");
		repProductos.save(p18);
		Producto p19 = new Producto("Captagrex 80", "urlCaptagrex");
		repProductos.save(p19);
		Producto p20 = new Producto("Ditiver C PM", "urlDitiver");
		repProductos.save(p20);
		Producto p21 = new Producto("Azufre Famolins", "urlAzufreFamolins");
		repProductos.save(p21);
		Producto p22 = new Producto("Volck Verano", "urlVolck");
		repProductos.save(p22);
		Producto p23 = new Producto("Nemacur 40 LE", "urlNemacur");
		repProductos.save(p23);
		Producto p24 = new Producto("Sanagricola WP", "urlSanagricola");
		repProductos.save(p24);
		Producto p25 = new Producto("Capteran 50", "urlCapteran");
		repProductos.save(p25);
		Producto p26 = new Producto("Pelt 50 SC", "urlPelt");
		repProductos.save(p26);
		Producto p27 = new Producto("Actellic 50-E", "urlActellic");
		repProductos.save(p27);
		Producto p28 = new Producto("Agral", "urlAgral");
		repProductos.save(p28);
		Producto p29 = new Producto("Cobre Key", "urlCobreKey");
		repProductos.save(p29);
		Producto p30 = new Producto("Cuprebel", "urlCuprebel");
		repProductos.save(p30);
		
		// Productos
		ArrayList<Producto> arrS1 = new ArrayList<>();
		arrS1.add(p1);
		arrS1.add(p2);
		arrS1.add(p3);
		arrS1.add(p28);
		arrS1.add(p24);
		SustanciaActiva s1 = new SustanciaActiva("Decanol", arrS1);
		repSustancias.save(s1);
		
		ArrayList<Producto> arrS2 = new ArrayList<>();
		arrS2.add(p2);
		arrS2.add(p3);
		arrS2.add(p28);
		arrS2.add(p27);
		arrS2.add(p26);
		SustanciaActiva s2 = new SustanciaActiva("1-metilciclopropeno", arrS2);
		repSustancias.save(s2);
		
		ArrayList<Producto> arrS3 = new ArrayList<>();
		arrS3.add(p2);
		arrS3.add(p3);
		arrS3.add(p28);
		arrS3.add(p11);
		arrS3.add(p12);
		SustanciaActiva s3 = new SustanciaActiva("1-naftilacetamida", arrS3);
		repSustancias.save(s3);
		
		ArrayList<Producto> arrS4 = new ArrayList<>();
		arrS4.add(p2);
		arrS4.add(p3);
		arrS4.add(p28);
		arrS4.add(p10);
		arrS4.add(p20);
		SustanciaActiva s4 = new SustanciaActiva("1-naftilacético", arrS4);
		repSustancias.save(s4);
		
		ArrayList<Producto> arrS5 = new ArrayList<>();
		arrS5.add(p2);
		arrS5.add(p3);
		arrS5.add(p28);
		arrS5.add(p9);
		arrS5.add(p13);
		SustanciaActiva s5 = new SustanciaActiva("1-4-dimetilnaftaleno", arrS5);
		repSustancias.save(s5);
		
		ArrayList<Producto> arrS6 = new ArrayList<>();
		arrS6.add(p2);
		arrS6.add(p3);
		arrS6.add(p28);
		arrS6.add(p9);
		arrS6.add(p13);
		SustanciaActiva s6 = new SustanciaActiva("2,4-D", arrS6);
		repSustancias.save(s6);
		
		ArrayList<Producto> arrS7 = new ArrayList<>();
		arrS7.add(p1);
		arrS7.add(p29);
		arrS7.add(p11);
		arrS7.add(p12);
		SustanciaActiva s7 = new SustanciaActiva("2,4-DB", arrS7);
		repSustancias.save(s7);
		
		ArrayList<Producto> arrS8 = new ArrayList<>();
		arrS8.add(p1);
		arrS8.add(p29);
		arrS8.add(p13);
		arrS8.add(p11);
		arrS8.add(p19);
		SustanciaActiva s8 = new SustanciaActiva("5-nitroguayacolato de sodio", arrS8);
		repSustancias.save(s8);
		
		ArrayList<Producto> arrS9 = new ArrayList<>();
		arrS9.add(p2);
		arrS9.add(p12);
		arrS9.add(p11);
		arrS9.add(p17);
		arrS9.add(p30);
		SustanciaActiva s9 = new SustanciaActiva("6-benzyladenina", arrS9);
		repSustancias.save(s9);
		
		ArrayList<Producto> arrS10 = new ArrayList<>();
		arrS10.add(p6);
		arrS10.add(p11);
		arrS10.add(p7);
		arrS10.add(p19);
		arrS10.add(p21);
		SustanciaActiva s10 = new SustanciaActiva("8-hidroxiquinoleina", arrS10);
		repSustancias.save(s10);
		
		ArrayList<Producto> arrS11 = new ArrayList<>();
		arrS11.add(p6);
		arrS11.add(p2);
		arrS11.add(p11);
		arrS11.add(p3);
		arrS11.add(p7);
		SustanciaActiva s11 = new SustanciaActiva("24-epibrasilónida", arrS11);
		repSustancias.save(s11);
		
		ArrayList<Producto> arrS12 = new ArrayList<>();
		arrS12.add(p11);
		arrS12.add(p1);
		arrS12.add(p2);
		arrS12.add(p3);
		arrS12.add(p4);
		SustanciaActiva s12 = new SustanciaActiva("Abamectina", arrS12);
		repSustancias.save(s12);
		
		ArrayList<Producto> arrS13 = new ArrayList<>();
		arrS13.add(p5);
		arrS13.add(p6);
		arrS13.add(p7);
		arrS13.add(p8);
		arrS13.add(p19);
		SustanciaActiva s13 = new SustanciaActiva("ABE-IT 56", arrS13);
		repSustancias.save(s13);
		
		ArrayList<Producto> arrS14 = new ArrayList<>();
		arrS14.add(p9);
		arrS14.add(p10);
		arrS14.add(p11);
		arrS14.add(p12);
		
		SustanciaActiva s14 = new SustanciaActiva("Aceite de naranja", arrS14);
		repSustancias.save(s14);
		
		ArrayList<Producto> arrS15 = new ArrayList<>();
		arrS15.add(p9);
		arrS15.add(p10);
		arrS15.add(p11);
		arrS15.add(p12);
		SustanciaActiva s15 = new SustanciaActiva("Aceites de pescado", arrS15);
		repSustancias.save(s15);
		
		ArrayList<Producto> arrS16 = new ArrayList<>();
		arrS16.add(p13);
		arrS16.add(p14);
		arrS16.add(p15);
		arrS16.add(p16);
		SustanciaActiva s16 = new SustanciaActiva("Aceite de citronella", arrS16);
		repSustancias.save(s16);
		
		ArrayList<Producto> arrS17 = new ArrayList<>();
		arrS17.add(p17);
		arrS17.add(p18);
		arrS17.add(p19);
		arrS17.add(p20);
		SustanciaActiva s17 = new SustanciaActiva("Aceite de clavo", arrS17);
		repSustancias.save(s17);
		
		ArrayList<Producto> arrS18 = new ArrayList<>();
		arrS18.add(p21);
		arrS18.add(p22);
		arrS18.add(p23);
		arrS18.add(p24);
		SustanciaActiva s18 = new SustanciaActiva("Aceite de colza", arrS18);
		repSustancias.save(s18);
		
		ArrayList<Producto> arrS19 = new ArrayList<>();
		arrS19.add(p25);
		arrS19.add(p26);
		arrS19.add(p27);
		arrS19.add(p28);
		SustanciaActiva s19 = new SustanciaActiva("Aceite de Menta", arrS19);
		repSustancias.save(s19);
		
		ArrayList<Producto> arrS20 = new ArrayList<>();
		arrS20.add(p21);
		arrS20.add(p22);
		arrS20.add(p23);
		arrS20.add(p24);
		SustanciaActiva s20 = new SustanciaActiva("Aceite de parafina", arrS18);
		repSustancias.save(s20);
		
		ArrayList<SustanciaActiva> arrP1 = new ArrayList<>();
		arrP1.add(s1);
		arrP1.add(s2);
		arrP1.add(s3);
		Plaga plaga1 = new Plaga("Pepino asesino", "Pepinuns asesinus", "urlPepino", arrP1);
		repPlagas.save(plaga1);
		
		ArrayList<SustanciaActiva> arrP2 = new ArrayList<>();
		arrP2.add(s5);
		arrP2.add(s6);
		arrP2.add(s7);
		Plaga plaga2 = new Plaga("Choclo asesino", "Koklus asesinus", "urlChoclo", arrP2);
		repPlagas.save(plaga2);
		
		ArrayList<SustanciaActiva> arrP3 = new ArrayList<>();
		arrP3.add(s8);
		arrP3.add(s9);
		arrP3.add(s10);
		Plaga plaga3 = new Plaga("Tomate asesino", "Tomatus asesinus", "urlTomate", arrP3);
		repPlagas.save(plaga3);
		
		ArrayList<SustanciaActiva> arrP4 = new ArrayList<>();
		arrP4.add(s11);
		arrP4.add(s12);
		arrP4.add(s13);
		Plaga plaga4 = new Plaga("Aguacate rebelde", "Awacatus rebeldus", "urlAguacate", arrP4);
		repPlagas.save(plaga4);
		
		ArrayList<SustanciaActiva> arrP5 = new ArrayList<>();
		arrP5.add(s8);
		arrP5.add(s9);
		arrP5.add(s10);
		arrP5.add(s11);
		arrP5.add(s12);
		Plaga plaga5 = new Plaga("Plaga de Egipto 1", "Plagus Unus", "urlPlaga1", arrP5);
		repPlagas.save(plaga5);
		
		ArrayList<SustanciaActiva> arrP6 = new ArrayList<>();
		arrP6.add(s13);
		arrP6.add(s14);
		arrP6.add(s15);
		arrP6.add(s16);
		arrP6.add(s17);
		Plaga plaga6 = new Plaga("Plaga de Egipto 2", "Plagus Dosus", "urlPlaga2", arrP6);
		repPlagas.save(plaga6);
		
		ArrayList<SustanciaActiva> arrP7 = new ArrayList<>();
		arrP7.add(s18);
		arrP7.add(s19);
		arrP7.add(s20);
		arrP7.add(s12);
		arrP7.add(s17);
		Plaga plaga7 = new Plaga("Plaga de Egipto 3", "Plagus Trisus", "urlPlaga3", arrP7);
		repPlagas.save(plaga7);
		
		ArrayList<SustanciaActiva> arrP8 = new ArrayList<>();
		arrP8.add(s12);
		arrP8.add(s1);
		arrP8.add(s5);
		arrP8.add(s6);
		arrP8.add(s13);
		Plaga plaga8 = new Plaga("Moscas molestas", "Drosophila molestadorus", "urlMoscas", arrP8);
		repPlagas.save(plaga8);
		
		ArrayList<SustanciaActiva> arrP9 = new ArrayList<>();
		arrP9.add(s1);
		arrP9.add(s7);
		arrP9.add(s3);
		Plaga plaga9 = new Plaga("Avispas asiáticas", "Avispus asius", "urlAvispas", arrP9);
		repPlagas.save(plaga9);
		
		ArrayList<SustanciaActiva> arrP10 = new ArrayList<>();
		arrP10.add(s3);
		arrP10.add(s4);
		arrP10.add(s12);
		Plaga plaga10 = new Plaga("Nematodos", "Nematodus", "urlNematodo", arrP10);
		repPlagas.save(plaga10);
		
		ArrayList<SustanciaActiva> arrP11 = new ArrayList<>();
		arrP11.add(s1);
		arrP11.add(s6);
		arrP11.add(s17);
		Plaga plaga11 = new Plaga("Pulgón", "Pulgus", "urlPulgon", arrP11);
		repPlagas.save(plaga11);
		
		ArrayList<SustanciaActiva> arrP12 = new ArrayList<>();
		arrP12.add(s19);
		arrP12.add(s20);
		arrP12.add(s17);
		Plaga plaga12 = new Plaga("Topos", "Topus topus", "urlTopo", arrP12);
		repPlagas.save(plaga12);
		
		ArrayList<SustanciaActiva> arrP13 = new ArrayList<>();
		arrP13.add(s12);
		arrP13.add(s3);
		arrP13.add(s13);
		Plaga plaga13 = new Plaga("Oidio", "Oidius", "urlOidio", arrP13);
		repPlagas.save(plaga13);
		
		ArrayList<SustanciaActiva> arrP14 = new ArrayList<>();
		arrP14.add(s6);
		arrP14.add(s16);
		arrP14.add(s11);
		Plaga plaga14 = new Plaga("Bichos comeplantas", "Bichus plantus", "urlBichoPlanta", arrP14);
		repPlagas.save(plaga14);
		
		ArrayList<SustanciaActiva> arrP15 = new ArrayList<>();
		arrP15.add(s1);
		arrP15.add(s6);
		arrP15.add(s17);
		Plaga plaga15 = new Plaga("Bichos rascasuelos", "Bichus suelus", "urlBichoSuelo", arrP15);
		repPlagas.save(plaga15);
		
		ArrayList<SustanciaActiva> arrP16 = new ArrayList<>();
		arrP16.add(s3);
		arrP16.add(s4);
		arrP16.add(s7);
		Plaga plaga16 = new Plaga("Orugas", "Orugus", "urlOruga", arrP16);
		repPlagas.save(plaga16);
		
		ArrayList<Plaga> arrE1 = new ArrayList<>();
		arrE1.add(plaga1);
		arrE1.add(plaga2);
		arrE1.add(plaga3);
		Especie especie1 = new Especie("Banano", "Bananus", arrE1);
		repEspecies.save(especie1);
		
		ArrayList<Plaga> arrE2 = new ArrayList<>();
		arrE2.add(plaga1);
		arrE2.add(plaga2);
		arrE2.add(plaga3);
		Especie especie2 = new Especie("Tomatero", "Tomatus", arrE2);
		repEspecies.save(especie2);
		
		ArrayList<Plaga> arrE3 = new ArrayList<>();
		arrE3.add(plaga1);
		arrE3.add(plaga2);
		arrE3.add(plaga3);
		Especie especie3 = new Especie("Boniato", "Boniatus", arrE3);
		repEspecies.save(especie3);
		
		ArrayList<Plaga> arrE4 = new ArrayList<>();
		arrE4.add(plaga4);
		arrE4.add(plaga5);
		arrE4.add(plaga6);
		arrE4.add(plaga7);
		Especie especie4 = new Especie("Manzano", "Manzanus", arrE4);
		repEspecies.save(especie4);
		
		ArrayList<Plaga> arrE5 = new ArrayList<>();
		arrE5.add(plaga8);
		arrE5.add(plaga9);
		arrE5.add(plaga10);
		arrE5.add(plaga11);
		Especie especie5 = new Especie("Aguacatero", "Aguacaterus", arrE5);
		repEspecies.save(especie5);
		
		ArrayList<Plaga> arrE6 = new ArrayList<>();
		arrE6.add(plaga12);
		arrE6.add(plaga13);
		arrE6.add(plaga14);
		arrE6.add(plaga15);
		Especie especie6 = new Especie("Perero", "Perus", arrE6);
		repEspecies.save(especie6);
		
		ArrayList<Plaga> arrE7 = new ArrayList<>();
		arrE7.add(plaga16);
		arrE7.add(plaga1);
		arrE7.add(plaga13);
		arrE7.add(plaga11);
		Especie especie7 = new Especie("Trigo duro", "Trigus durus", arrE7);
		repEspecies.save(especie7);
		
		ArrayList<Plaga> arrE8 = new ArrayList<>();
		arrE8.add(plaga12);
		arrE8.add(plaga13);
		arrE8.add(plaga14);
		arrE8.add(plaga1);
		Especie especie8 = new Especie("Judías secas", "Judus secus", arrE8);
		repEspecies.save(especie8);
		
		ArrayList<Especie> arrC1 = new ArrayList<>();
		arrC1.add(especie1);
		arrC1.add(especie2);
		arrC1.add(especie3);
		CategoriaCultivo cat1 = new CategoriaCultivo("Cultivos de raíz firme", arrC1);
		repCultivos.save(cat1);
		
		ArrayList<Especie> arrC2 = new ArrayList<>();
		arrC2.add(especie2);
		arrC2.add(especie5);
		arrC2.add(especie6);
		CategoriaCultivo cat2 = new CategoriaCultivo("Cultivos de secano", arrC2);
		repCultivos.save(cat2);
		
		ArrayList<Especie> arrC3 = new ArrayList<>();
		arrC3.add(especie1);
		arrC3.add(especie7);
		arrC3.add(especie5);
		CategoriaCultivo cat3 = new CategoriaCultivo("Cultivos de regadío", arrC3);
		repCultivos.save(cat3);
		
		ArrayList<Especie> arrC4 = new ArrayList<>();
		arrC4.add(especie5);
		arrC4.add(especie3);
		arrC4.add(especie8);
		CategoriaCultivo cat4 = new CategoriaCultivo("Cultivos de antaño", arrC4);
		repCultivos.save(cat4);
		
		ArrayList<Especie> arrC5 = new ArrayList<>();
		arrC5.add(especie1);
		arrC5.add(especie7);
		arrC5.add(especie5);
		CategoriaCultivo cat5 = new CategoriaCultivo("Cultivos vistosos", arrC5);
		repCultivos.save(cat5);
	}
	
	//GET's listas de elementos
	@RequestMapping(value = "/categorias_cultivos", method = RequestMethod.GET)
	public List<CategoriaCultivo> getCategoriasCultivos(){
		return repCultivos.findAll();
	}
	
//	@RequestMapping(value = "/categorias_cultivos/{nombre}", method = RequestMethod.GET)
//	public List<Especie> getEspeciesCategoriaCultivoNombre(@PathVariable("nombre") String nombre){
//		return repCultivos.findByNombre(nombre).getListaEspecies();
//	}
	
	@RequestMapping(value = "/categorias_cultivos/{id}", method = RequestMethod.GET)
	public List<Especie> getEspeciesCategoriaCultivo(@PathVariable("id") long id){
		
		return repCultivos.findById(id).get().getListaEspecies();
	}
	
	@RequestMapping(value = "/especies", method = RequestMethod.GET)
	public List<Especie> geEspecies(){
		return repEspecies.findAll();
	}
	
	@RequestMapping(value = "/especies/{id}", method = RequestMethod.GET)
	public List<Plaga> getPlagasEspecieNombre(@PathVariable("id") long id){
		return repEspecies.findById(id).get().getListaPlagas();
	}
	
	@RequestMapping(value = "/productos", method = RequestMethod.GET)
	public List<Producto> getFitoProductos(){
		return repProductos.findAll();
	}
	
	@RequestMapping(value = "/plagas/{id}", method = RequestMethod.GET)
	public List<SustanciaActiva> getSustanciasPlagas(@PathVariable("id") long id){
		return repPlagas.findById(id).get().getListSustanciasActivas();
	}
	
	@RequestMapping(value = "/plagas", method = RequestMethod.GET)
	public List<Plaga> getPlagas(){
		return repPlagas.findAll();
	}
	
	@RequestMapping(value = "/sustancias_activas/{id}", method = RequestMethod.GET)
	public List<Producto> getProductosSustancias(@PathVariable("id") long id){
		return repSustancias.findById(id).get().getListFitoProds();
	}
	
	@RequestMapping(value = "/sustancias_activas", method = RequestMethod.GET)
	public List<SustanciaActiva> getSustanciasActivas(){
		return repSustancias.findAll();
	}
}
