package co.com.store.models;

import co.com.store.tasks.DiligenciarFormularioCompra;
import lombok.Builder;



public class FormularioCompraBuilder {


    FormularioCompraModel formularioCompraModel;
    private String nombre;
    private String pais;
    private String ciudad;
    private String targetaCredito;
    private String mes;
    private String year;


    public FormularioCompraBuilder(String pais) {
        this.pais= pais;
    }
    public FormularioCompraBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    public FormularioCompraBuilder conCiudad(String ciudad) {
        this.ciudad = ciudad;
        return this;
    }
    public FormularioCompraBuilder conTargetaCredito(String targetaCredito) {
        this.targetaCredito = targetaCredito;
        return this;
    }
    public FormularioCompraBuilder conMes(String mes) {
        this.mes = mes;
        return this;
    }

    public DiligenciarFormularioCompra conYear(String year) {
        this.year = year;
        return new DiligenciarFormularioCompra(formularioCompraModel.builder()
                .pais(this.pais)
                .nombre(this.nombre)
                .ciudad(this.ciudad)
                .targetaCredito(this.targetaCredito)
                .mes(this.mes)
                .year(this.year)
                .build());
    }
}
