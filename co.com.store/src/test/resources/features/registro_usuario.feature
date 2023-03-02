#language: es

Característica: Registro de usuario
  Como usuario estándar en la tienda
  Necesito registrarme en el sitio web de la tienda
  Para crear un usuario registrado en la tienda

  Antecedentes:
    Dado que el usuario se encuentra en la tienda

  Escenario: Registro exitoso
    Cuando el usuario suministre las credenciales de registro correctamente
    Entonces el usuario podrá observar que se registro correctamente


  Escenario: Registro no exitoso por campo username
    Cuando el usuario no suministre el campo username en el registro
    Entonces el usuario podrá observar que no se registro correctamente


  Escenario: Registro no exitoso por campo contraseña
  Cuando el usuario no suministre el campo contraseña en el registro
  Entonces el usuario podrá observar que no se registro correctamente


  Escenario: Registro no exitoso por campos vacíos
  Cuando el usuario no suministre todos los campos en el registro
  Entonces el usuario podrá observar que no se registro correctamente

