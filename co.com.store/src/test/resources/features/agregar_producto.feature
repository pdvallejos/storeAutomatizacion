#language: es

Característica: Agregar productos al carrito de compras
  Como usuario de la tienda
  Necesito agregar productos al carrito de compras
  Para realizar la compra de los mismos

  Antecedentes:
    Dado que el usuario se encuentra en la tienda

  Escenario: Agregar producto de forma exitosa
    Cuando el usuario agregue un producto al carrito de compras
    Entonces el usuario podrá observar que se agrego correctamente al carrito de compras


  Esquema del escenario: Escenario: Agregar varios productos al carrito de compras
    Cuando el usuario agregue "<numeroProductos>" productos al carrito de compras
    Entonces el usuario podrá observar que se agregaron "<numeroProductos>" correctamente al carrito de compras

    Ejemplos:
    |numeroProductos|
    |3              |
