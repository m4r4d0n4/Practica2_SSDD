package servPeliculas;

import java.util.List;

public class Pelicula {

	private List<Actor> reparto;
	private String titulo;

	public Pelicula(){}

	public Pelicula(String titulo, List<Actor> reparto) {
		this.titulo = titulo;
		this.reparto = reparto;
	}

	public List<Actor> getReparto() {
		return reparto;
	}

	public void setReparto(List<Actor> reparto) {
		this.reparto = reparto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}

	