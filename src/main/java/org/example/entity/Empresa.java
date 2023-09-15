package org.example.entity;

import org.example.validations.EmpresalValidacion;

public abstract class Empresa {
    private Long id;
    private String nit;
    private String nombre;
    private Long ubicacion;
    private String descripcion;

    protected EmpresalValidacion validacion=new EmpresalValidacion();

    public Empresa() {
    }

    public Empresa(Long id, String nit, String nombre, Long ubicacion, String descripcion) {
        this.id = id;
        this.nit = nit;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        try{
            this.validacion.validarNit(nit);
            this.nit=nit;
        }catch (Exception error){
            System.out.println("\u001B[31m"+ error.getMessage() +"\u001B[0m");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try{
            this.validacion.validarNombreEmpresa(nombre);
            this.nombre=nombre;
        }catch(Exception error){
            System.out.println("\u001B[31m"+ error.getMessage() +"\u001B[0m");
        }
    }

    public Long getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Long ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
