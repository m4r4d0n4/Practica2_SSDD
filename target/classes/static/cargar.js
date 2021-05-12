$(function() {
    var urlCategorias = "http://localhost:8080/categorias_cultivos"
    $.getJSON(urlCategorias, function (categorias) {
        lista = $('#lista')
        for (categoria of categorias) {
            // $(lista.append($("<div/>").html(categorias[categoria].nombre)))
            // alert(lista.append(categoria.nombre))
            // alert(categoria.nombre) funciona
            lista.append("<h1>" + categoria.nombre + "</h1>")
        }
    })
})
