#language: es

  Característica: Remover productos del carrito de compras
    Como usuario de la tienda
    Necesito remover un producto del carrito de compras
    Para corregir un error en el proceso de elección de productos

    Escenario: Remover producto de forma exitosa
      Dado que el usuario se encuentra en la tienda
      Cuando elimine un producto que ha sido agregado al carrito de compras
      Entonces podrá observar que se eliminó correctamente el producto del carrito de compras


    Escenario: Remover un producto repetido del carrito de compras
      Dado que el usuario se encuentra en la tienda
      Cuando remueva un producto repetido del carrito de compras
      Entonces podrá observar que se removio correctamente del carrito de compras