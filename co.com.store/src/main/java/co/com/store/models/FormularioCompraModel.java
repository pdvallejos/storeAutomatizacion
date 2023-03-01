package co.com.store.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Builder
public class FormularioCompraModel {



    private String nombre;
    private String pais;
    private String ciudad;
    private String targetaCredito;
    private String mes;
    private String year;

    public FormularioCompraModel() {

    }

    public FormularioCompraModel(String nombre, String pais, String ciudad, String targetaCredito, String mes, String year) {
        this.nombre = nombre;
        this.pais = pais;
        this.ciudad = ciudad;
        this.targetaCredito = targetaCredito;
        this.mes = mes;
        this.year = year;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTargetaCredito() {
        return targetaCredito;
    }

    public void setTargetaCredito(String targetaCredito) {
        this.targetaCredito = targetaCredito;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
