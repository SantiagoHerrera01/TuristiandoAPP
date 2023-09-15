package org.example.entity;

import org.example.entity.Interface.IReporte;

public class EntidadCultural extends Empresa implements IReporte {

    private String secretaria;
    private String mision;

    public EntidadCultural() {
    }

    public EntidadCultural(Long id, String nit, String nombre, Long ubicacion, String descripcion, String secretaria, String mision) {
        super(id, nit, nombre, ubicacion, descripcion);
        this.secretaria = secretaria;
        this.mision = mision;
    }

    public String getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(String secretaria) {
        this.secretaria = secretaria;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    @Override
    public void generarReporte() {

    }

    @Override
    public void editarReporte(Integer id, String datosNuevos) {

    }

    @Override
    public void buscarReporte(Integer id) {

    }
}
