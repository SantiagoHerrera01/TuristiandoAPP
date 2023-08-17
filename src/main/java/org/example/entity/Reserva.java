package org.example.entity;

import java.time.LocalDate;

public class Reserva {
    private Integer id;
    private Usuario usuario;
    private Oferta oferta;
    private Double costoTotal;
    private LocalDate fechaReserva=LocalDate.of(2023,7,27);;

    public Reserva() {
    }

    public Reserva(Integer id, Usuario usuario, Oferta oferta, Double costoTotal, LocalDate fechaReserva) {
        this.id = id;
        this.usuario = usuario;
        this.oferta = oferta;
        this.costoTotal = costoTotal;
        this.fechaReserva = fechaReserva;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {

        this.usuario = usuario;
    }

    public Oferta getOferta() {
        return oferta;
    }

    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
}