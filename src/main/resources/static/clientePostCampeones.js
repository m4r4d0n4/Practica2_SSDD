$(function() {

var urlGestor ='http://localhost:8080/peliculas';

var campeones = {"titulo" :"Campeones",
	     "reparto": [
	      {"nombre" : "Javier Gutiérrez",
		   "personaje" : "Marco"},
		  {"nombre" : "Juan Margallo",
		   "personaje": "Julio"} 
	   ]
    }
$.ajax({
    url : urlGestor,
    type: "POST",
    data: JSON.stringify(campeones),
    contentType: "application/json; charset=utf-8",
    dataType   : "json",
    success    : function() {
        console.log("Se ha creado con éxito");
    }
});

});
