#language: es

Característica: Realizar proceso de compra de productos
  Como usuario de la tienda
  Necesito realizar una compra
  Para satisfacer una necesidad personal

  Antecedentes:
    Dado que el usuario se encuentra en la tienda


  Escenario: Realizar compra exitosa
    Cuando el usuario ingresa productos al carrito de compras
    Y el usuario realiza el proceso de compra
    Entonces el usuario visualiza un mensaje de compra exitosa

  Escenario: 002- compra no exitosa por campo nombre
    Cuando el usuario ingresa productos al carrito de compras
    Y el usuario realiza el proceso de compra sin completar el campo nombre
    Entonces el usuario visualiza una alerta de campo requerido

  Escenario: 003- compra no exitosa por campo tarjeta de credito
    Cuando el usuario ingresa productos al carrito de compras
    Y el usuario realiza el proceso de compra sin completar el campo tarjeta de credito
    Entonces el usuario visualiza una alerta de campo requerido

  Escenario: 004- compra sin productos en el carrito
    Cuando el usuario realiza el proceso de compra sin productos en el carrito
    Entonces el usuario visualiza un mensaje de error