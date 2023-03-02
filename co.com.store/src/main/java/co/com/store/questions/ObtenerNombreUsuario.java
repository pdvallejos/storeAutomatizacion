package co.com.store.questions;

import co.com.store.models.FrontDTO;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.store.userinterfaces.LoginInterfaces.TXT_SESION_USUARIO;

public class ObtenerNombreUsuario implements Question<FrontDTO> {
    Actor actor;

    @Override
    public FrontDTO answeredBy(Actor actor) {
        this.actor = actor;
        return desdeElFront();
    }

    private FrontDTO desdeElFront() {
        return FrontDTO.builder()
                .usuario(TXT_SESION_USUARIO.resolveFor(actor).getTextContent()).build();
    }
}
