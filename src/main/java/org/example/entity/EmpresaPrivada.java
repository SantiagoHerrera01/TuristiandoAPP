package org.example.entity;

import org.example.entity.Interface.IReporte;

public class EmpresaPrivada extends Empresa implements IReporte {
    private String representanteLegal;

    public EmpresaPrivada() {
    }

    public EmpresaPrivada(Long id, String nit, String nombre, Long ubicacion, String descripcion, String representanteLegal) {
        super(id, nit, nombre, ubicacion, descripcion);
        this.representanteLegal = representanteLegal;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
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
