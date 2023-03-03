# language: es

Característica:  Relizar solicitud de contacto
    Como usuario estandar de la tienda
    Necesito realizar una peticion de contacto
    Para enviar un mensaje

    Antecedentes:
        Dado que el usuario se encuentra en la tienda

    Escenario: Contacto exitoso
        Cuando el usuario realice una solicitud de contacto
        Entonces el usuario podra observar que se realizo la solicitud de contacto exitosamente

    Escenario: Contacto no exitoso por campo correo
        Cuando el usuario realice una solicitud de contacto sin completar el campo correo
        Entonces el usuario podra observar que no se realizo la solicitud de contacto

    Escenario: Contacto no exitoso por campo nombre del contacto
        Cuando el usuario realice una solicitud de contacto sin completar el campo nombre del contacto
        Entonces el usuario podra observar que no se realizo la solicitud de contacto

    Escenario: Contacto no exitoso por campos vacios
        Cuando el usuario realice una solicitud de contacto sin completar todos los campos
        Entonces el usuario podra observar que no se realizo la solicitud de contacto
