package org.example.entity;

import org.example.entity.Interface.IReporte;

public class Afiliado extends Usuario implements IReporte {
    private Integer valorMensualidad;

    public Afiliado() {
    }

    public Afiliado(Long id, String docmento, String nombres, String correo, Long ubicacion, Integer valorMensualidad) {
        super(id, docmento, nombres, correo, ubicacion);
        this.valorMensualidad = valorMensualidad;
    }

    public Integer getValorMensualidad() {
        return valorMensualidad;
    }

    public void setValorMensualidad(Integer valorMensualidad) {
        this.valorMensualidad = valorMensualidad;
    }

    @Override
    public void registrar(){

    }

    //IReporte
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
