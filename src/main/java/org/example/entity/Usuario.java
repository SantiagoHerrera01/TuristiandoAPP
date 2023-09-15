package org.example.entity;

import org.example.validations.UsuarioValidacion;

public abstract class Usuario {
    protected UsuarioValidacion validacion=new UsuarioValidacion();
    private static long nextId=1;
    private Long id;
    private String docmento;
    private String nombres;
    private String correo;
    private Long ubicacion;



    public Usuario() {
    }

    public Usuario(Long id, String docmento, String nombres, String correo, Long ubicacion) {
        this.id = nextId++;
        this.docmento = docmento;
        this.nombres = nombres;
        this.correo = correo;
        this.ubicacion = ubicacion;
    }


    public Long getId() {
        return nextId++;
    }

    public void setId(Long id) {

        this.id = nextId++;
    }

    public String getDocmento() {
        return docmento;
    }

    public void setDocmento(String docmento) {
        this.docmento = docmento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) throws Exception {
        try {
            this.validacion.validarNombres(nombres);
            this.nombres=nombres;
        }catch (Exception error){
            System.out.println("\u001B[31m"+ error.getMessage() +"\u001B[0m");
        }

    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) throws Exception {
        try {
            this.validacion.validarCorreo(correo);
            this.correo=correo;
        }catch (Exception error){
            System.out.println("\u001B[31m"+ error.getMessage() +"\u001B[0m");
        }
    }

    public Long getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Long ubicacion) {
        try{
            this.validacion.validarUbicacion(ubicacion);
            this.ubicacion=ubicacion;
        }catch(Exception error){
            System.out.println("\u001B[31m"+ error.getMessage() +"\u001B[0m");
        }

    }

    public abstract void registrar();
}
