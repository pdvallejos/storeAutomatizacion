# language: es

Característica: inicio de sesion
    Como usuario estandar de la tienda
    Necesito loguearme en el sitio web de la tienda
    Para ingresar a la tienda con mi usuario

    Antecedentes:
        Dado que el usuario se encuentra en la tienda

    Escenario: inicio de sesion exitoso
        Cuando el usuario suministre las credenciales correctamente
        Entonces el usuario podrá observar que ingreso correctamente

    Escenario: Inicio de sesión fallido
        Cuando el usuario suministre las credenciales de ingreso incorrectamente
        Entonces el usuario podrá observar la alerta que el usuario no existe

    Escenario: Inicio de sesión fallido por contraseña
        Cuando el usuario suministre las credenciales de ingreso sin la contraseña
        Entonces el usuario podrá observar la alerta de que debe completar todos los campos

    Escenario: Inicio de sesión fallido por username
        Cuando el usuario suministre las credenciales de ingreso con contraseña no valida
        Entonces el usuario podrá observar la alerta de que la contraseña es invalida
