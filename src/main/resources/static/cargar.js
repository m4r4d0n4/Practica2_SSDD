$(function() {
    var urlCategorias = "http://localhost:8080/categorias_cultivos"
    $.getJSON(urlCategorias, function (categorias) {
        lista = $('#lista')
        for (categoria of categorias) {
            lista.append("<h1>" + categoria.nombre + "</h1>")
        }
    })
})
