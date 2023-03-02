#language: es

  Característica: Remover productos del carrito de compras
    Como usuario de la tienda
    Necesito remover un producto del carrito de compras
    Para corregir un error en el proceso de elección de productos


    Antecedentes:
      Dado que el usuario se encuentra en la tienda

    Escenario: Remover producto de forma exitosa
      Cuando el usuario agregue un producto al carrito de compras
      Y el usuario elimine un producto
      Entonces el usuario podrá observar que se eliminó correctamente el producto del carrito de compras


    Escenario: Verificar que se modifique el valor total de la compra cuando se elimina un producto
      Cuando el usuario agregue "3" productos al carrito de compras
      Y el usuario elimine un producto
      Entonces el usuario podrá observar que se modifica el precio total de la compra