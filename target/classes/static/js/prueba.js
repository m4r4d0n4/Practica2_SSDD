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
	s.append($("<ul name ='listaEspecies'>"));
	var arbolesEspecies = s.find("ul[name = 'listaEspecies']")
	$.getJSON(urlEspecies, 
		function(especies) {
			for(especie in especies) {
			 	arbolesEspecies.append($("<li name = 'liespecie'>").html(especies[especie].nombreVulgar))
			}
		}).done(function() {
				$("li[name = 'liespecie']").on("click", function() {cargarPlagas($(this))})});
}

function cargarPlagas(s) {
	console.log(s.text());
	var urlPlagas = "http://localhost:8080/especies/"+encodeURI(s.text());
	console.log(urlPlagas);
	s.append($("<ul name = 'listaPlagas'>"));
	var arbolesPlagas = s.find("ul[name = 'listaPlagas']")
	$.getJSON(urlPlagas,
		function(plagas) {
			for(plaga in plagas) {
				arbolesPlagas.append($("<li name = 'liplaga'>").html(plagas[plaga].nombreVulgar))
			}
		})/*.done(function() {
				$("li[name = 'liplaga']").on("click", function() {cargarSustanciasActivas($(this))})})*/;
}

function cargarSustanciasActivas(s){
	console.log();
}
