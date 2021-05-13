var cont = 0

function borrarListaSustancia() {
	var aux = $(this).attr('id')
	var idAux = $(this).attr('id')
	$('.'+idAux).empty()
	$("#" + aux).off("click", borrarListaSustancia)
	$("#" + aux).on("click", expandirSustancia)
	$("#" + aux).html("[+]")
}

function expandirSustancia() {
	var aux = $(this).attr('id')
	var idAux = $(this).attr('value')
	var urlProducto = "http://localhost:8080/sustancias_activas/" + encodeURI(idAux)
	$.getJSON(urlProducto, function(productos) {
		for (producto of productos) {
			$('.' + aux).append(
				"<li>" + producto.nombre + " " + producto.url + " <ul class="+cont+"> </ul> </li> "
			)
			cont = cont + 1
		}
	})
	$("#" + aux).off("click", expandirSustancia)
	$("#" + aux).on("click", borrarListaSustancia)
	$("#" + aux).html("[-]")
}

function borrarListaPlaga() {
	var aux = $(this).attr('id')
	var idAux = $(this).attr('id')
	$('.'+idAux).empty()
	$("#" + aux).off("click", borrarListaPlaga)
	$("#" + aux).on("click", expandirPlaga)
	$("#" + aux).html("[+]")
}

function expandirPlaga() {
	var aux = $(this).attr('id')
	var idAux = $(this).attr('value')
	var urlSustancia = "http://localhost:8080/plagas/" + encodeURI(idAux)
	$.getJSON(urlSustancia, function(sustancias) {
		for (sustancia of sustancias) {
			$('.' + aux).append(
				"<li> <button id=" + cont + " value="+ sustancia.id +" class=link>[+]</button>" + sustancia.nombre + " <ul class="+cont+"> </ul> </li> "
			)
			$("#" + cont).on('click', expandirSustancia)
			cont = cont + 1
		}
	})
	$("#" + aux).off("click", expandirPlaga)
	$("#" + aux).on("click", borrarListaPlaga)
	$("#" + aux).html("[-]")
}

function borrarListaEspecie() {
	var aux = $(this).attr('id')
	var idAux = $(this).attr('id')
	$('.'+idAux).empty()
	$("#" + aux).off("click", borrarListaEspecie)
	$("#" + aux).on("click", expandirEspecie)
	$("#" + aux).html("[+]")
}

function expandirEspecie() {
	var aux = $(this).attr('id')
	var idAux = $(this).attr('value')
	var urlPlagas = "http://localhost:8080/especies/" + encodeURI(idAux)
	$.getJSON(urlPlagas, function(plagas) {
		for (plaga of plagas) {
			$('.' + aux).append(
				"<li> <button id=" + cont + " value="+ plaga.id +" class=link>[+]</button>" + "<p class = p"+ cont +" plinea >"+plaga.nombreVulgar + " "  + plaga.url +"</p>" + " <ul class="+cont+"> </ul> </li> "
			)
			$(".p"+cont).easyTooltip({content: "<span style='color:blue;'>"+plaga.nombreCientifico +"</span>", tooltipDir:"right"});
			$("#" + cont).on('click', expandirPlaga)
			cont = cont + 1
		}
	})
	$("#" + aux).off("click", expandirEspecie)
	$("#" + aux).on("click", borrarListaEspecie)
	$("#" + aux).html("[-]")
}

function borrarListaCategoria() {
	var aux = $(this).attr('id')
	var idAux = $(this).attr('id')
	$('.'+idAux).empty()
	$("#" + aux).off("click", borrarListaCategoria)
	$("#" + aux).on("click", expandirCategoria)
	$("#" + aux).html("[+]")
}

function expandirCategoria() {
	var aux = $(this).attr('id')
	var idAux = $(this).attr('value')
	var urlEspecies = "http://localhost:8080/categorias_cultivos/" + encodeURI(idAux)
	$.getJSON(urlEspecies, function(especies) {
		for (especie of especies) {
			$('.' + aux).append(
				"<li> <button id=" + cont + " value="+especie.id+" class=link>[+]</button>" + "<p class = p"+ cont +">"+especie.nombreVulgar + "</p>" + " <ul class="+cont+"> </ul> </li> "
			)
			$(".p"+cont).easyTooltip({content: "<span style='color:blue;'>"+especie.nombreCientifico+"</span>", tooltipDir:"right"});
			$("#" + cont).on('click', expandirEspecie)
			cont = cont + 1
		}
	})
	$("#" + aux).off("click", expandirCategoria)
	$("#" + aux).on("click", borrarListaCategoria)
	$("#" + aux).html("[-]")
}

$(function() {
    var urlCategorias = "http://localhost:8080/categorias_cultivos"
    $.getJSON(urlCategorias, function (categorias) {
        lista = $('#categoria-cultivos')
        
        for (categoria of categorias) {
        	lista.append("<li> <button id=" + cont + " value="+categoria.id+" class = link>[+]</button>" + categoria.nombre +"<ul class="+cont+"> </ul> </li> ")
        	$("#" + cont).on('click',  expandirCategoria)	
        	cont = cont + 1
        }
    })
})

/*
	v1.0
	funcional
	cambios:
		- nombres m?s significativos
		- mirar los borrar (pillamos dos veces el id)
		- hacer tooltip (mejorar los <p>)
		- extra: ver si se puede dhcaer de una forma m?s limpia
		- display: 'inline' en <p>
*/