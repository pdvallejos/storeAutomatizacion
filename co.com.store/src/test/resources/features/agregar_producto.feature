#language: es

Característica: Agregar productos al carrito de compras
  Como usuario de la tienda
  Necesito agregar productos al carrito de compras
  Para realizar la compra de los mismos

  Escenario: Agregar producto de forma exitosa
    Dado que el usuario se encuentra en la tienda
    Cuando el usuario agregue un producto al carrito de compras
    Entonces el usuario podrá observar que se agrego correctamente al carrito de compras


  Escenario: Agregar dos productos iguales de forma exitosa
    Dado que el usuario se encuentra en la tienda
    Cuando agregue dos productos de la misma referencia al carrito de compras
    Entonces podrá observar que se agregaron correctamente al carrito de compras