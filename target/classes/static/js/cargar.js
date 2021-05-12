var cont = 0

function borrarListaSustancia() {
	var aux = $(this).attr('id')
	var idAux = $(this).attr('id')
	console.log("Se borrará el ul asociado al id" + idAux)
	$('.'+idAux).empty()
	$("#" + aux).off("click", borrarListaSustancia)
	$("#" + aux).on("click", expandirSustancia)
}

function expandirSustancia() {
	var aux = $(this).attr('id')
	var idAux = $(this).attr('value')
	var urlProducto = "http://localhost:8080/sustancias_activas/" + encodeURI(idAux)
	$.getJSON(urlProducto, function(productos) {
		for (producto of productos) {
			$('.' + aux).append(
				"<li>" + producto.nombre + " <ul class="+cont+"> </ul> </li> "
			)
			cont = cont + 1
		}
	})
	$("#" + aux).off("click", expandirSustancia)
	$("#" + aux).on("click", borrarListaSustancia)
}

function borrarListaPlaga() {
	var aux = $(this).attr('id')
	var idAux = $(this).attr('id')
	console.log("Se borrará el ul asociado al id" + idAux)
	$('.'+idAux).empty()
	$("#" + aux).off("click", borrarListaPlaga)
	$("#" + aux).on("click", expandirPlaga)
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
}

function borrarListaEspecie() {
	var aux = $(this).attr('id')
	var idAux = $(this).attr('id')
	console.log("Se borrará el ul asociado al id" + idAux)
	$('.'+idAux).empty()
	$("#" + aux).off("click", borrarListaEspecie)
	$("#" + aux).on("click", expandirEspecie)
}

function expandirEspecie() {
	var aux = $(this).attr('id')
	var idAux = $(this).attr('value')
	var urlPlagas = "http://localhost:8080/especies/" + encodeURI(idAux)
	$.getJSON(urlPlagas, function(plagas) {
		for (plaga of plagas) {
			$('.' + aux).append(
				"<li> <button id=" + cont + " value="+ plaga.id +" class=link>[+]</button>" + plaga.nombreVulgar + " <ul class="+cont+"> </ul> </li> "
			)
			$("#" + cont).on('click', expandirPlaga)
			cont = cont + 1
		}
	})
	$("#" + aux).off("click", expandirEspecie)
	$("#" + aux).on("click", borrarListaEspecie)
}

function borrarListaCategoria() {
	var aux = $(this).attr('id')
	var idAux = $(this).attr('id')
	console.log("Se borrará el ul asociado al id" + idAux)
	$('.'+idAux).empty()
	$("#" + aux).off("click", borrarListaCategoria)
	$("#" + aux).on("click", expandirCategoria)
}

function expandirCategoria() {
	var aux = $(this).attr('id')
	var idAux = $(this).attr('value')
	var urlEspecies = "http://localhost:8080/categorias_cultivos/" + encodeURI(idAux)
	$.getJSON(urlEspecies, function(especies) {
		for (especie of especies) {
			$('.' + aux).append(
				"<li> <button id=" + cont + " value="+especie.id+" class=link>[+]</button>" + especie.nombreVulgar + " <ul class="+cont+"> </ul> </li> "
			)
			$("#" + cont).on('click', expandirEspecie)
			cont = cont + 1
		}
	})
	$("#" + aux).off("click", expandirCategoria)
	$("#" + aux).on("click", borrarListaCategoria)
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
