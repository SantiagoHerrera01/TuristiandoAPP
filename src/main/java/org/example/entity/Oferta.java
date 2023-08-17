package org.example.entity;

import org.example.helpers.Util;
import org.example.validations.OfertaValidacion;

import java.time.LocalDate;

public class Oferta {
    protected Util util = new Util();
    protected OfertaValidacion validacion=new OfertaValidacion();
    private Long id;
    private String titulo;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double costoPersona;
    private Local local ;


    public Oferta() {
    }

    public Oferta(Long id, String titulo, String descripcion, LocalDate fechaInicio, LocalDate fechaFin,
                  Double costoPersona, Local local) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoPersona = costoPersona;
        this.local = local;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws Exception{
        try {
            this.validacion.validarTitulo(titulo);
            this.titulo=titulo;
        }catch (Exception error) {
            System.out.println("\u001B[31m" + error.getMessage() + "\u001B[0m");
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio){
        try{
            OfertaValidacion ofertaValidacion = new OfertaValidacion();
            ofertaValidacion.validarFecha(fechaInicio);
            this.fechaInicio = util.convertirFechaStringALocalDate(fechaInicio);
        }catch (Exception error){
            System.out.println("\u001B[31m"+ error.getMessage() +"\u001B[0m");
        }

    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        try {
            OfertaValidacion ofertaValidacion = new OfertaValidacion();
            ofertaValidacion.validarFecha(fechaFin);
            this.validacion.validarFechaFin(this.fechaInicio,util.convertirFechaStringALocalDate(fechaFin));
            this.fechaFin=util.convertirFechaStringALocalDate(fechaFin);
        }catch (Exception error){
            System.out.println("\u001B[31m"+ error.getMessage() +"\u001B[0m");
        }
    }

    public Double getCostoPersona() {
        return costoPersona;
    }

    public void setCostoPersona(Double costoPersona) throws Exception{
        try{
            this.validacion.validarCostoPersona(costoPersona);
            this.costoPersona=costoPersona;
        }catch (Exception error){
            System.out.println("\u001B[31m"+ error.getMessage() +"\u001B[0m");
        }
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
