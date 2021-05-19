// contador de entidades global (nos permitirá identificar unívocamente a los botones de nuestra página web)
var cont = 0

// esta función vacía la lista de productos asociada a una sustancia
function borrarListaSustancia() {
//     obtener el identificador del botón pulsado
	var aux = $(this).attr('id') 
// 	var idAux = $(this).attr('id')
//     vaciar lista asociada al producto cuya clase coincide con el id del botón
	$('.' + aux).empty()
//     impedir que el botón pulsado borre la lista de nuevo (ahora estaría vacía)
	$("#" + aux).off("click", borrarListaSustancia)
//     permitir que el botón pulsado expanda la lista recién borrada
	$("#" + aux).on("click", expandirSustancia)
//     pista para el usuario sepa que el botón se puede expandir de nuevo (aparece un +)
	$("#" + aux).html("[+]")
}

// esta función devuelve la lista de productos asociados a la sustancia cuyo botón se pulsa
function expandirSustancia() {
//     obtener el identificador del botón pulsado
	var aux = $(this).attr('id')
//     obtener el identificador que en nuestra base de datos se relaciona con el id de la sustancia a expandir
	var idAux = $(this).attr('value')
//     solicitar la lista de productos asociada a la sustancia activa
	var urlProducto = "http://localhost:8080/sustancias_activas/" + encodeURI(idAux)
	$.getJSON(urlProducto, function(productos) {
		for (producto of productos) { // bucle para construir la lista
			$('.' + aux).append(
				"<li>" + producto.nombre + " " + producto.url + " <ul class="+cont+"> </ul> </li> "
			)
			cont = cont + 1
		}
	})
//     impedir que el botón recién pulsado expanda la lista de nuevo
	$("#" + aux).off("click", expandirSustancia)
//     permitir que el botón recién pulsado borre la lista
	$("#" + aux).on("click", borrarListaSustancia)
//     pista para que el usuario sepa que el botón puede contraer la lista
	$("#" + aux).html("[-]")
}

// función que vacía la lista que se desprende al expandir una plaga
function borrarListaPlaga() {
//     identificar botón pulsado
	var aux = $(this).attr('id')
// 	var idAux = $(this).attr('id')
//     vaciar lista
	$('.' + aux).empty()
//     impedir que la lista se pueda vaciar de nuevo
	$("#" + aux).off("click", borrarListaPlaga)
//     permitir que la lista se pueda expandir
	$("#" + aux).on("click", expandirPlaga)
//     indicar al usuario que se puede expandir la lista de nuevo
	$("#" + aux).html("[+]")
}

// esta función devuelve las sustancias activas asociadas a una plaga
function expandirPlaga() {
//     obtener el identificador del botón pulsado
	var aux = $(this).attr('id')
//     obtener el id asociado a la plaga en nuestra base de datos
	var idAux = $(this).attr('value')
//     pedir la lista de sustancias asociadas
	var urlSustancia = "http://localhost:8080/plagas/" + encodeURI(idAux)
	$.getJSON(urlSustancia, function(sustancias) {
		for (sustancia of sustancias) { // bucle para construir la lista
			$('.' + aux).append(
				"<li> <button id=" + cont + " value="+ sustancia.id +" class='link text-light btn btn-warning'>[+]</button>" + sustancia.nombre + " <ul class="+cont+"> </ul> </li> "
			)
            // permitir que los botones pulsados expandan listas de sustancias a su vez
			$("#" + cont).on('click', expandirSustancia)
			cont = cont + 1
		}
	})
//     impedir que la lista se pueda expandir de nuevo
	$("#" + aux).off("click", expandirPlaga)
//     permitir que la lista se pueda contraer
	$("#" + aux).on("click", borrarListaPlaga)
//     indicación visual de que la lista se puede contraer
	$("#" + aux).html("[-]")
}

// borramos la lista de plagas asociada a una especie
function borrarListaEspecie() {
//     obtener id del botón pulsado
	var aux = $(this).attr('id')
// 	var idAux = $(this).attr('id')
//     vaciar la lista que se desprende de la especie
	$('.' + aux).empty()
//     impedir que la lista se pueda vaciar de nuevo
	$("#" + aux).off("click", borrarListaEspecie)
//     permitir que la lista se pueda expandir de nuevo
	$("#" + aux).on("click", expandirEspecie)
//     indicación visual para el usuario de que la lista se puede expandir de nuevo
	$("#" + aux).html("[+]")
}

// esta función devuelve la lista de plagas asociada a una especie
function expandirEspecie() {
//     obtenemos el identificador del botón pulsado
	var aux = $(this).attr('id')
//     obtener el id asociado a la especie en la base de datos
	var idAux = $(this).attr('value')
//     pedir la lista de plagas
	var urlPlagas = "http://localhost:8080/especies/" + encodeURI(idAux)
	$.getJSON(urlPlagas, function(plagas) {
		for (plaga of plagas) { // bucle para crear la lista
			$('.' + aux).append(
				"<li> <button id=" + cont + " value="+ plaga.id +" class='link text-light btn btn-warning'>[+]</button>" + "<p class = p"+ cont +" plinea >"+plaga.nombreVulgar + " "   +"</p>" + plaga.url + " <ul class="+cont+"> </ul> </li> "
			)
//             añadir el tooltip pedido en el enunciado
			$(".p"+cont).easyTooltip({content: "<span style='color:blue;'>"+plaga.nombreCientifico +"</span>", tooltipDir:"right"});
//             permitir que los botones de las plagas recién mostradas permitan expandir listas propias
			$("#" + cont).on('click', expandirPlaga)
			cont = cont + 1
		}
	})
//     impedir que se pueda expandir la lista de nuevo
	$("#" + aux).off("click", expandirEspecie)
//     permitir que se pueda borrar esta lista recién creada
	$("#" + aux).on("click", borrarListaEspecie)
//     indicación visual para el usuario de que la lista se puede contraer
	$("#" + aux).html("[-]")
}

// esta función permite borrar la lista asociada a una categoría
function borrarListaCategoria() {
//     obtener identificador del botón recién pulsado
	var aux = $(this).attr('id')
// 	var idAux = $(this).attr('id')
//     vaciar la lista asociada a la categoría
	$('.' + aux).empty()
//     impedir que la lista se pueda borrar de nuevo
	$("#" + aux).off("click", borrarListaCategoria)
//     permitir que la lista se pueda expandir de nuevo
	$("#" + aux).on("click", expandirCategoria)
//     indicación para el usuario de que la lista se puede expandir
	$("#" + aux).html("[+]")
}

// esta función devuelve la lista de especies asociada a una categoría
function expandirCategoria() {
//     obtener identificador del botón recién pulsado
	var aux = $(this).attr('id')
//     obtener identificador que tiene la categoría en la base de datos
	var idAux = $(this).attr('value')
//     solicitar lista de especies
	var urlEspecies = "http://localhost:8080/categorias_cultivos/" + encodeURI(idAux)
	$.getJSON(urlEspecies, function(especies) {
		for (especie of especies) { // bucle de creación de lista
			$('.' + aux).append(
				"<li> <button id=" + cont + " value="+especie.id+" class='link text-light btn btn-warning'>[+]</button>" + "<p class = p"+ cont +">"+especie.nombreVulgar + "</p>" + " <ul class="+cont+"> </ul> </li> "
			)
//             crear el tooltip como se pide en el enunciado
			$(".p"+cont).easyTooltip({content: "<span style='color:blue;'>"+especie.nombreCientifico+"</span>", tooltipDir:"right"});
//             permitir que los botones que se vayan creando expandan las listas de las especies
			$("#" + cont).on('click', expandirEspecie)
			cont = cont + 1
		}
	})
//     impedir que esta categoría se pueda expandir de nuevo
	$("#" + aux).off("click", expandirCategoria)
//     permitir que la lista asociada a esta categoría se pueda borrar
	$("#" + aux).on("click", borrarListaCategoria)
//     indicación visual para el usuario
	$("#" + aux).html("[-]")
}

// punto de entrada del script
$(function() {
    // solicitar la lista de categorías de cultivos para mostrarla en el html
    var urlCategorias = "http://localhost:8080/categorias_cultivos"
    $.getJSON(urlCategorias, function (categorias) {
        lista = $('#categoria-cultivos') // seleccionar un elemento html creado específicamente como raíz de todo el árbol
        for (categoria of categorias) { // bucle de creación de lista
        	lista.append("<li> <button id=" + cont + " value="+categoria.id+" class='link text-light btn btn-warning'>[+]</button>" + categoria.nombre +"<ul class="+cont+"> </ul> </li> ")
//             permitir que los botones recién creados permitan expandir las categorías para ver las especies
        	$("#" + cont).on('click',  expandirCategoria)	
        	cont = cont + 1
        }
    })
})
