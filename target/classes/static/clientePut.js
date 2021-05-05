$(function() {



var urlPelicula ='http://localhost:8080/pelicula/'+encodeURI('Las bicicletas son para el verano');

$.getJSON(urlPelicula,

     function (respuesta) {
	      respuesta.reparto[3] = new Object();
          respuesta.reparto[3].nombre = "Marisa Paredes";
          respuesta.reparto[3].personaje = "Doña María";
          $.ajax({
               url : urlPelicula,
               type: "PUT",
               data: JSON.stringify(respuesta),
               contentType: "application/json; charset=utf-8",
               dataType   : "json",
               success    : function() {
                   alert("Se ha modificado con éxito");
               }
           });
 
 });



});
