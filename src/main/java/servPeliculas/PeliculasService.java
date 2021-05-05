package servPeliculas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class PeliculasService {

	private Map<String, Pelicula> peliculaMap = new HashMap<String, Pelicula>();

	public PeliculasService() {
		crearDatosDePrueba();
	}

	public Pelicula getPelicula(String titulo) {
		return peliculaMap.get(titulo);
	}

	public List<Pelicula> getPeliculas() {
		return new ArrayList<Pelicula>(peliculaMap.values());
	}

	public void addPelicula(Pelicula pelicula) {
		this.peliculaMap.put(pelicula.getTitulo(), pelicula);
	}
	
	public void modifyPelicula(Pelicula pelicula) {
		this.peliculaMap.remove(pelicula.getTitulo());
		this.peliculaMap.put(pelicula.getTitulo(), pelicula);
	}

	private void crearDatosDePrueba() {

		List<Pelicula> peliculas = new ArrayList<Pelicula>();

		Actor geraldine = new Actor("Geraldine Chaplin", "Ana" );
		Actor fernando = new Actor("Fernando Fernán Gómez", "Fernando");
		Actor amparo= new Actor("Amparo Muñoz", "Natalia");
		List<Actor> repartoMama100 = new ArrayList<Actor>();
		repartoMama100.add(geraldine);
		repartoMama100.add(fernando);
		repartoMama100.add(amparo);
		Pelicula mamaCumple = new Pelicula("Mamá cumple cien años", repartoMama100);
		peliculas.add(mamaCumple);

		Actor agustin = new Actor("Agustín González", "Luis");
		Actor soler = new Actor("Amparo Soler Leal", "Dolores");
		Actor victoria = new Actor("Victoria Abril", "Manolita");
		List<Actor> repartoBicicletas = new ArrayList<Actor>();
		repartoBicicletas.add(agustin); 
		repartoBicicletas.add(soler);
		repartoBicicletas.add(victoria);
		Pelicula bicicletas = new Pelicula("Las bicicletas son para el verano",repartoBicicletas);
		peliculas.add(bicicletas);

		for (Pelicula pelicula : peliculas) {
			peliculaMap.put(pelicula.getTitulo(), pelicula);
		}
	}

}
