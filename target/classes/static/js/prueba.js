$(function cargarCultivo(){
	var urlCultivo = "http://localhost:8080/categorias_cultivos";
	$.getJSON(urlCultivo,
		function(cultivos) {
			arbolCultivos = $("#categoria-cultivos"); 
			for (cultivo in cultivos) {
				arbolCultivos.append($("<li name = 'licultivo'>").html(cultivos[cultivo].nombre));
			}
		}).done(function() {
				$("li[name = 'licultivo']").on("click", function() {cargarEspecies($(this))})
		});
});
function cargarEspecies(s) {
	var urlEspecies = "http://localhost:8080/categorias_cultivos/"+encodeURI(s.text());
	s.append($("<ul name ='listaEspecies'>"))
	var arbolesEspecies = s.find("ul[name = 'listaEspecies']")
	$.getJSON(urlEspecies, 
		function(especies) {
			for(especie in especies) {
				arbolesEspecies.append($("<li name = 'liespecie'>").html(especies[especie].nombreVulgar))
			}
		})	
}

function cargarCosas(){
$(function() {

var urlProductos ="http://localhost:8080/productos/"+encodeURI(s);

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

