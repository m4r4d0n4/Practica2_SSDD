function cargarCosas(){
$(function() {

var urlProductos ="http://localhost:8080/productos";

$.getJSON(urlProductos,

     function (productos) {
	
	lista =$('#listaProductos');
	
	for (producto in productos) {
		lista.append($("<h1/>").html(productos[producto].nombre));
		lista.append($("<p/>").html(productos[producto].url));		
	}
  });
});
}
$("#pulsame").click(function(){
	cargarCosas();
});

