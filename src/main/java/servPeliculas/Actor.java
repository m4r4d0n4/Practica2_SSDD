package servPeliculas;

public class Actor {

	private String nombre;
	private String personaje;

	public Actor(){}

	public Actor(String nombre, String personaje) {
		this.nombre = nombre;
		this.personaje = personaje;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPersonaje() {
		return personaje;
	}

	public void setPersonaje(String personaje) {
		this.personaje = personaje;
	}


}