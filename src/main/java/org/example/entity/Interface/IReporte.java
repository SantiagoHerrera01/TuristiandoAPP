package org.example.entity.Interface;

public interface IReporte {

    void generarReporte();
    void editarReporte(Integer id, String datosNuevos);
    void buscarReporte(Integer id);
}
