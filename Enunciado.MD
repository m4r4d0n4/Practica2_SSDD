# Requisitos de cosas que hay que usar

* Frontend con HTML, CSS, JavaScript y jQuery
* Para el cliente, se utilizan páginas HTML5, hojas CSS y archivos de código JavaScript, incluyendo bibliotecas como jQuery jQuery-UI.

# Requisitos de funcionalidad

* Cada elemento del árbol debe tener un botón, que al pulsarlo despliegue el siguiente nivel para ese nodo. Cuando se despliegue la información de un nodo del árbol, cambia la apariencia y la funcionalidad del botón, que servirá para volver a plegar todo el subárbol asociado, borrando la información correspondiente del DOM para ahorrar memoria.
* Al pulsar los botones, se genera una petición para obtener en segundo plano la información de lo que sea, hasta llegar al nivel más bajo de la jerarquía (productos fitosanitarios).
* Se replicará la información cuando sea necesaria para visualizarla.
* Para hacer el árbol se tiene que usar ul y li
* Para el nombre científico de las especies cultivadas y de las plagas no se mostrará directamente en árbol, sino un tooltip utilizando la extensiónde jQuery easyTooltip
