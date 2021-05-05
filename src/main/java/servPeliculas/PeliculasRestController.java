package servPeliculas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeliculasRestController {

	@Autowired
	private PeliculasService peliculasService;


	@RequestMapping(value = "/peliculas", method = RequestMethod.GET)
	public List<Pelicula> getPeliculas() {
		return peliculasService.getPeliculas();
	}

	@RequestMapping(value = "/pelicula/{tituloPelicula}", method = RequestMethod.GET)
	public Pelicula getPelicula(@PathVariable("tituloPelicula") String tituloPelicula) {
		return peliculasService.getPelicula(tituloPelicula);
	}
	

	@RequestMapping(value = "/peliculas", method = RequestMethod.POST)
	public ResponseEntity<Boolean> addPelicula(@RequestBody Pelicula pelicula) {
		peliculasService.addPelicula(pelicula);
		return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/pelicula/{tituloPelicula}", method = RequestMethod.PUT)
	public ResponseEntity<Boolean> modifyPelicula(@PathVariable("tituloPelicula") String tituloPelicula,@RequestBody Pelicula pelicula) {
		peliculasService.modifyPelicula(pelicula);
		return new ResponseEntity<Boolean>(true,HttpStatus.OK);
	}

}