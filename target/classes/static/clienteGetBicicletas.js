$(function() {

var urlPelicula ='http://localhost:8080/pelicula/'+encodeURI('Las bicicletas son para el verano');

$.getJSON(urlPelicula,

     function (respuesta) {

        lista =$('#listaPeliculas');
        lista.append($('<h2/>').html(respuesta.titulo));
		
		lista.append($('<h3/>').html('Reparto:'));
		for (actor in respuesta.reparto) {
		   lista.append($('<p>').html(respuesta.reparto[actor].nombre));
	    }
  });
});
