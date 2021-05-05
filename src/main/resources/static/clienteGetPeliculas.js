$(function() {

var urlpelicula ='http://localhost:8080/peliculas';

$.getJSON(urlpelicula,

     function(respuesta) {
        lista =$('#listaPeliculas');
		lista.append($('<h1/>').html('PELICULAS EN LA LISTA:'));
		
		for (pelicula in respuesta){
           lista.append($('<h2/>').html(respuesta[pelicula].titulo));
		
		   lista.append($('<h3/>').html('Reparto'));
		   for (actor in respuesta[pelicula].reparto) {
		      lista.append($('<p>').html(respuesta[pelicula].reparto[actor].nombre));
	       }
		}
  });
});
